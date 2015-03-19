import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jettison.json.JSONObject;

import com.google.code.linkedinapi.client.oauth.LinkedInOAuthService;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthServiceFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInRequestToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getMyProfile(request,response);
		//getMyProfileById(request,response);
		getMyConnection(request,response);
		//PeopleSearch(request, response);
		//getOutOfNetworkProfile(request, response);
	}

	
	public Person getMyProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("getMyProfile::");
		Person personInfo = new Person();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		
		
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~?format=json&oauth2_access_token=" + auth);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("inside if" + output);
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
	
	public void getMyProfileById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("getMyProfileById::");
		Person personInfo = new Person();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		Person person =getMyProfile(request, response);
		System.out.println("personInfo.Id::"+person.getId());
		WebResource getMyProfileWebResource = client.resource("https://api.linkedin.com/v1/people/id="+person.getId()+"?format=json&oauth2_access_token=" + auth);
		ClientResponse Profile = getMyProfileWebResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp1:::::" + Profile);
		if (Profile.getStatus() == 200) {
			String output = Profile.getEntity(String.class);
			System.out.println("output " + output);
			try{
				System.out.println("Inside try::");
				personInfo = new ObjectMapper().readValue(output, Person.class);
				System.out.println("Profile::"+personInfo);

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}

		}
		
	}

	public Connection getMyConnection(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("getMyConnections::");
		Connection connection = new Connection();
		Client client = Client.create();
		String auth = request.getParameter("auth");
		WebResource getMyconnectionsWebResource = client.resource("https://api.linkedin.com/v1/people/~/connections?format=json&modified=new&oauth2_access_token=" + auth);
		ClientResponse Connections = getMyconnectionsWebResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp1:::::" + Connections);
		if (Connections.getStatus() == 200) {
			String output = Connections.getEntity(String.class);
			System.out.println("output::::" + output);
			try{
				System.out.println("Inside try::");
				JSONObject jObject = new JSONObject(output);
				//connection = new ObjectMapper().readValue(output , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Person.class));
				//connection = new ObjectMapper().readValue(output , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Connection.class));
				connection=	new ObjectMapper().readValue(output, Connection.class);
				System.out.println("connections::::"+connection);
				return connection;
			}catch (Exception e) {
				System.out.println("Exception" + e);
			}
		}
		return connection; 
	}
	
	public void getOutOfNetworkProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("getOutOfNetworkProfile::");
		Client client = Client.create();
		Person personInfo = new Person();
		String auth = request.getParameter("auth");
		Person person =getMyProfile(request, response);
		System.out.println("personInfo.Id::"+person.getId());
		WebResource getMyconnectionsWebResource = client.resource("https://api.linkedin.com/v1/people/id="+person.getId()+"?format=json&modified=new&oauth2_access_token=" + auth);
		ClientResponse Connections = getMyconnectionsWebResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp1:::::" + Connections);
		if (Connections.getStatus() == 200) {
			String output = Connections.getEntity(String.class);
			System.out.println("output::::" + output);
			try{
				System.out.println("Inside try in getOutOfNetworkProfile::");
				personInfo = new ObjectMapper().readValue(output, Person.class);
				System.out.println("personInfo in getOutOfNetworkProfile::"+personInfo);
			}catch (Exception e) {
				System.out.println("Exception" + e);
			}
		} 
	}
	
	
	

	public void PeopleSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("PeopleSearch::");
		Client client = Client.create();
		String auth = request.getParameter("auth");
		WebResource getPeopleSearch = client.resource("https://api.linkedin.com/v1/people-search?format=json&sort=connections&oauth2_access_token=" + auth);
        ClientResponse PeopleSearch = getPeopleSearch.accept("text/html").get(ClientResponse.class);
        System.out.println("resp:::::" + PeopleSearch);
        if (PeopleSearch.getStatus() == 200) {
            String output = PeopleSearch.getEntity(String.class);
            System.out.println("output" + output);
            try{
            	System.out.println("Inside try::");
    			JSONObject jObject = new JSONObject(output);
    			String people = jObject.getString("people");
    			System.out.println("people::"+people);
    			JSONObject jObjectPeople = new JSONObject(people);
    			String values = jObjectPeople.getString("values");
    			System.out.println("values::"+values);
    			List<Person> persons = new ObjectMapper().readValue(jObjectPeople.getString("values") , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Person.class));
    			System.out.println("persons" + persons);
    		}catch (Exception e) {
    			System.out.println("Exception" + e);
    		}
        } 
 }
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}