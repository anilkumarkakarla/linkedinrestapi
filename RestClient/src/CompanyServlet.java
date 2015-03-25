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

		//getCompanyById(request,response);
		//getCompanyByUniversalName(request,response);
		//getCompanyByEmailDomain(request,response);
		//getCompanyByIdAndUniversalName(request,response);
		//searchCompanies(request,response);
		//getFollwedCompanies(request,response);
		//getCompanyUpdates(request,response);
		//getStartFollowingCompanies(request,response);
		//getFollwedCompanies(request,response);
	}



	public Company getCompanyById(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
		System.out.println("getCompanyById::");
		Company company = new Company(); 
		Client client = Client.create();


		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies/id=1009?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			try{
				System.out.println("Inside try::");
				company = new ObjectMapper().readValue(output, Company.class);
				System.out.println("company::::::"+company);
				return company;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}

		}
		return company;

	}	


	public Company getCompanyByUniversalName(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{

		System.out.println("getCompanyByUniversalName::");
		Company company = new Company();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies/universal-name=linkedin?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			try{
				System.out.println("Inside try::");
				company = new ObjectMapper().readValue(output, Company.class);
				System.out.println("company::::::"+company);
				return company;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return company;
	}

	public CompaniesGroup getCompanyByEmailDomain(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{



		System.out.println("getCompanyByEmailDomain::");
		CompaniesGroup companies = new CompaniesGroup();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies?format=json&email-domain=linkedin.com&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);


		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);

			try{
				System.out.println("Inside try::");
				companies=	new ObjectMapper().readValue(output, CompaniesGroup.class);
				System.out.println("companies::::"+companies);
				return companies;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}	

		}
		return companies;
	}







	public CompaniesGroup getCompanyByIdAndUniversalName(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{

		System.out.println("getCompanyByIdAndUniversalName::");
		Client client = Client.create();
		CompaniesGroup companies = new CompaniesGroup();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/companies::(162479,universal-name=linkedin)?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);

		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);

			try{
				System.out.println("Inside try::");
				companies=	new ObjectMapper().readValue(output, CompaniesGroup.class);
				System.out.println("companies::::"+companies);
				return companies;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}	


		}
		return companies;
	}


	public Output searchCompanies(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{

		System.out.println("searchCompanies::");
		Client client = Client.create();
		Output output =  new Output();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/company-search?format=json&sort=relevance&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);

		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result::::" + result);

			try{
				JSONObject jObject = new JSONObject(result);
				output=	new ObjectMapper().readValue(result, Output.class);
				System.out.println("output::::"+output);
				return output;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}	
			
	     }
		
		return output;
	}
		
		public GetFollowedCompany getFollwedCompanies(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
			
			System.out.println("getFollwedCompanies:::::");
			Client client = Client.create();
			GetFollowedCompany company = new GetFollowedCompany();
			WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/following/companies?format=json&oauth2_access_token=" + accessToken);
			ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
			System.out.println("resp:::::" + resp);
					
			if (resp.getStatus() == 200) {
				String output = resp.getEntity(String.class);
				System.out.println("output::::" + output);
				
				try{
					System.out.println("Inside getFollweCompanies try::");
					JSONObject jObject = new JSONObject(output);
					//List<Company> company = new ObjectMapper().readValue(jObject.getString("values") , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Person.class));

					company=	new ObjectMapper().readValue(output, GetFollowedCompany.class);
					System.out.println("getFollweCompanies::"+company);
					
				}catch (Exception e) {
					System.out.println("Exception" + e);
				}	
				

			}
			return company;
		
		
		
		
		
	}
	
		public CompaniesGroup getCompanyUpdates(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
			
			
			
			System.out.println(" getCompanyUpdates::");
			Client client = Client.create();
			CompaniesGroup companies = new CompaniesGroup();	
			WebResource webResource = client.resource("https://api.linkedin.com/v1/companies/1337/updates?format=json&oauth2_access_token=" + accessToken);
			ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
			System.out.println("resp:::::" + resp);
			
			
			if (resp.getStatus() == 200) {
				String output = resp.getEntity(String.class);
				System.out.println("output:::::" + output);
				
				try{
					System.out.println("Inside  getCompanyUpdates  try::");
					JSONObject jObject = new JSONObject(output);
					/*String values = jObject.getString("values");
					System.out.println("valuesssss::::::"+values);
					JSONObject innerValues = new JSONObject(values);
					//System.out.println("innerValues::"+innerValues.getJSONArray("likes").getString(0));
					//System.out.println("innerValues::"+innerValues.getJSONObject("likes").getString("values"));
					String invalues = innerValues.getString("likes");
				   //JSONObject invalues = innerValues.getJSONObject("likes");
					System.out.println("innerValues::"+invalues);

					List<Person> persons = new ObjectMapper().readValue(jObject.getString("values") , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Person.class));
					System.out.println("persons"+persons.toString());*/


				companies=	new ObjectMapper().readValue(output, CompaniesGroup.class);
				System.out.println("getCompanyUpdates::::"+companies);
				return companies;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();

			}	

		}
		return companies;	
	} 

	public CompaniesGroup getStartFollowingCompanies(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{

		System.out.println(" getStartFollowingCompanies::");
		Client client = Client.create();
		CompaniesGroup companies = new CompaniesGroup();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/following/companies?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);

		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("output::::" + output);

			try{
				System.out.println("Inside getStartFollowingCompanies try::");
				companies=	new ObjectMapper().readValue(output, CompaniesGroup.class);
				System.out.println("getStartFollowingCompanies::::"+companies);
				return companies;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}	


		}
		return companies;

	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
