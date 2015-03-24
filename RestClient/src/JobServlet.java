import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


@WebServlet("/CompanyServlet")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JobServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getJob(request,response);
	}



	public Jobs getJob(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("getJob::");
		Jobs jobs = new Jobs();
		Client client = Client.create();
		String auth = request.getParameter("auth");


		WebResource webResource = client.resource("https://api.linkedin.com/v1/jobs/1337?format=json&oauth2_access_token=" + auth);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("output:::::::" + output);
			try{
				System.out.println("Inside try::");
				jobs = new ObjectMapper().readValue(output, Jobs.class);
				System.out.println("company::::::"+jobs);
				return jobs;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}

		}
		return jobs;

	}	




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
