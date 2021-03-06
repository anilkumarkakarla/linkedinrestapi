import java.io.IOException;

import javax.servlet.ServletException;

import org.codehaus.jackson.map.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class CompanyServlet {

	public Company getCompanyById(String accessToken) {
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


	public Company getCompanyByUniversalName(String accessToken) {

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

	public CompaniesGroup getCompanyByEmailDomain(String accessToken) {



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







	public CompaniesGroup getCompanyByIdAndUniversalName(String accessToken) {
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


	public Output searchCompanies(String accessToken) {

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
				output=	new ObjectMapper().readValue(result, Output.class);
				System.out.println("output::::"+output);
				return output;
			}catch (Exception e) {
				System.out.println("Exception" + e);
			}	
		}

		return output;
	}

	public GetFollowedCompany getFollwedCompanies(String accessToken) {

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
				company=	new ObjectMapper().readValue(output, GetFollowedCompany.class);
				System.out.println("getFollweCompanies::"+company);

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}	

		}
		return company;
	}

	public CompaniesGroup getCompanyUpdates(String accessToken) {
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

				companies=	new ObjectMapper().readValue(output, CompaniesGroup.class);
				System.out.println("getCompanyUpdates::::"+companies);
				return companies;

			}catch (Exception e) {
				System.out.println("Exception" + e);

			}	
		}
		return companies;	
	} 

	public CompaniesGroup getStartFollowingCompanies(String accessToken) {

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

	public void StartFollowingCompanies(String accessToken) throws Exception{ 
		System.out.println("StartFollowingCompanies:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<company><id>1337</id></company>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/following/companies?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void StopFollowingCompanies(String accessToken){ 
		System.out.println("StopFollowingCompanies:::::::");
		StringBuilder requestBody = new StringBuilder();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/following/companies/id=1337?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").delete(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}



	public SuggestedCompanies getSuggestedCompanyToFollow(String accessToken){
		System.out.println("getSuggestedCompanyToFollow::");
		SuggestedCompanies suggestedCompanies = new SuggestedCompanies();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/suggestions/to-follow/companies?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
			try{
				System.out.println("Inside try::");
				suggestedCompanies = new ObjectMapper().readValue(output, SuggestedCompanies.class);
				System.out.println("company::::::"+suggestedCompanies);
				return suggestedCompanies;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 
		}
		return suggestedCompanies;
	}
}
