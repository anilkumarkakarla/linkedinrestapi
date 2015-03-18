import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.code.linkedinapi.client.oauth.LinkedInOAuthService;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthServiceFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInRequestToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


@WebServlet("/CompanyServlet")
public class CompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CompanyServlet() {
		super();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getCompanyById(request,response);
		getCompanyByUniversalName(request,response);
		getCompanyByEmailDomain(request,response);
		
	}
	
	
	
	public Person getCompanyById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("getCompanyById::");
		Person personInfo = new Person();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		
		
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies/id=1009?format=json&oauth2_access_token=" + auth);
		//WebResource webResource = client.resource(url+"="+ auth);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			//JsonGenerator out = resp.getEntity(JsonGenerator.class);
			try{
				System.out.println("Inside try::");
				personInfo = new ObjectMapper().readValue(output, Person.class);
				System.out.println("personInfo::"+personInfo);
				return personInfo;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}

		}
		return personInfo;

	}	
	

	public Person getCompanyByUniversalName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("getCompanyByUniversalName::");
		Person personInfo = new Person();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies/universal-name=linkedin?format=json&oauth2_access_token=" + auth);
		//WebResource webResource = client.resource(url+"="+ auth);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			//JsonGenerator out = resp.getEntity(JsonGenerator.class);
			try{
				System.out.println("Inside try::");
				personInfo = new ObjectMapper().readValue(output, Person.class);
				System.out.println("personInfo::"+personInfo);
				return personInfo;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return personInfo;
	}
	
	public void getCompanyByEmailDomain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		
		System.out.println("getCompanyByEmailDomain::");
		Person personInfo = new Person();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies?format=json&email-domain=linkedin.com&oauth2_access_token=" + auth);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		
		
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			
			try{
				System.out.println("Inside try::");
				JSONObject jObject = new JSONObject(output);
				List<Person> persons = new ObjectMapper().readValue(jObject.getString("values") , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Person.class));
				System.out.println("persons"+persons.toString());

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}	

		}
			
	}
	
	
	
	
	
	
	
	public void getCompanyByIdAndUniversalName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("getCompanyByIdAndUniversalName::");
		Person personInfo = new Person();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies::(162479,universal-name=linkedin)?format=json&oauth2_access_token=" + auth);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		Map<String, Object> map = new HashMap<String, Object>();
		ObjectMapper mapper = new ObjectMapper();
		
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			

		}
		
	}
	
	 
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
