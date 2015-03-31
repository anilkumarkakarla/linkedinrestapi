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




	public class Job {
		

	public Jobs getJob( String accessToken) throws ServletException, IOException{
		System.out.println("getJob::");
		Jobs jobs = new Jobs();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/jobs/1337?format=json&oauth2_access_token=" + accessToken);
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


	
	public JobBookmark getJobBookmark(String accessToken) throws ServletException, IOException{
		System.out.println("JobBookmark::");
		JobBookmark jobBookmark = new JobBookmark();
		Client client = Client.create();	
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/job-bookmarks?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("output:::::::" + output);
			try{
				System.out.println("Inside try::");
				jobBookmark = new ObjectMapper().readValue(output, JobBookmark.class);
				System.out.println("company::::::"+jobBookmark);
				return jobBookmark;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return jobBookmark;

		

	}	


	public CompanyVacancy getMemberSuggestedJobs(String accessToken ) throws ServletException, IOException{
		System.out.println("SuggestedCompany::");
		//System.out.println("accessToken:::"+accessToken);
		CompanyVacancy companyVacancy = new CompanyVacancy();
				Client client = Client.create();
				WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/suggestions/job-suggestions:(jobs)?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				companyVacancy = new ObjectMapper().readValue(result, CompanyVacancy.class);
				System.out.println("output::::::"+companyVacancy);
				return companyVacancy;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return companyVacancy;

	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
