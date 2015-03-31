import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class NetworkUpdates {
	

	public CompaniesGroup getNetworkUpdates( String accessToken ) throws ServletException, IOException{
		System.out.println("NetworkUpdates::");
		System.out.println("accessToken:::"+accessToken);
		CompaniesGroup companiesGroup = new CompaniesGroup();
				Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/updates?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				companiesGroup = new ObjectMapper().readValue(result, CompaniesGroup.class);
				System.out.println("output::::::"+companiesGroup);
				return companiesGroup;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return companiesGroup;
	}

	public CompaniesGroup getMemberNetworkUpdates( String accessToken ) throws ServletException, IOException{
		System.out.println("MemberNetworkUpdates::");
		System.out.println("accessToken:::"+accessToken);
		CompaniesGroup companiesGroup = new CompaniesGroup();
				Client client = Client.create();
       WebResource webResource = client.resource("https://api.linkedin.com/v1/people/NcL1eZFWfO/network/updates?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				companiesGroup = new ObjectMapper().readValue(result, CompaniesGroup.class);
				System.out.println("output::::::"+companiesGroup);
				return companiesGroup;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return companiesGroup;
	}
	
	public NetworkStatistics getNetworkStatistics(String accessToken ) throws ServletException, IOException{
		System.out.println("NetworkStatistics::");
		System.out.println("accessToken:::"+accessToken);
		NetworkStatistics networkStatistics = new NetworkStatistics();
				Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/network-stats?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				networkStatistics = new ObjectMapper().readValue(result, NetworkStatistics.class);
				System.out.println("output::::::"+networkStatistics);
				return networkStatistics;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return networkStatistics;
	}



public  void PostNetworkUpdates (String accessToken) throws Exception {
	System.out.println("PostNetworkUpdates:::::::");
	  StringBuilder requestBody = new StringBuilder();
	  requestBody.append("<?xml version='1.0' encoding='UTF-8'?>");
	  requestBody.append("<activity locale=\"en_US\">");
	  requestBody.append("<content-type>linkedin-html</content-type>");
	  requestBody.append("  <body>&amp;lt;a href=&amp;quot;http://www.linkedin.com/profile?viewProfile=&amp;amp;key=3639896&amp;amp;authToken=JdAa&amp;amp;authType=name&amp;amp;trk=api*a119686*s128146*&amp;quot;&amp;gt;Kirsten Jones&amp;lt;/a&amp;gt; is reading about &amp;lt;a href=&amp;quot;http://www.tigers.com&amp;quot;&amp;gt;Tigers&amp;lt;/a&amp;gt;http://www.tigers.com&amp;gt;Tigers&amp;lt;/a&amp;gt;..</body>");
	  requestBody.append("</activity>");
	    Client client = Client.create();
	  WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/person-activities?oauth2_access_token=" + accessToken);
	  ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
	  System.out.println("result:::::::" + resp);
	 }
}