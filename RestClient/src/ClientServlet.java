import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONObject;

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
         System.out.println("Inside doGet of ClientServlet");
		String authUrl = null;
		try{
			authUrl = "https://www.linkedin.com/uas/oauth2/authorization?response_type=code&client_id=77ywtoz3eay8jk&scope=rw_groups%20w_messages%20r_basicprofile%20r_contactinfo%20r_network"
					+ "&state=qvP3Jh0mHBkUs80i&redirect_uri=http://localhost:8080/RestClient/callback";

		}catch (Exception e) {
			e.printStackTrace();  
		}
		response.sendRedirect(authUrl);


		//getMyProfile(request,response);
		//getMyProfileById(request,response);
		//getMyConnection(request,response);
		//PeopleSearch(request, response);
		//getMyMemberConnectionsById(request, response);
		//getOutOfNetworkProfile( request, response);
	}







	public Person getMyProfile(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
		System.out.println("getMyProfile::");
		Person personInfo = new Person();
		Client client = Client.create();

		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~?format=json&oauth2_access_token=" + accessToken);
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

	public void getMyProfileById(HttpServletRequest request, HttpServletResponse response,String accessToken) throws ServletException, IOException{

		System.out.println("getMyProfileById::");
		Person personInfo = new Person();
		Client client = Client.create();
		Person person =getMyProfile(request, response, accessToken);
		System.out.println("personInfo.Id::"+person.getId());
		WebResource getMyProfileWebResource = client.resource("https://api.linkedin.com/v1/people/id="+person.getId()+"?format=json&oauth2_access_token=" + accessToken);
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

	public Connection getMyConnection(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
		System.out.println("getMyConnections::");
		Connection connection = new Connection();
		Client client = Client.create();
		WebResource getMyconnectionsWebResource = client.resource("https://api.linkedin.com/v1/people/~/connections?format=json&modified=new&oauth2_access_token=" + accessToken);
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
				e.printStackTrace();
			}
		} 
		return connection;
	}

	public void getOutOfNetworkProfile(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
		System.out.println("getOutOfNetworkProfile::");
		Client client = Client.create();
		Person personInfo = new Person();
		Person person =getMyProfile(request, response, accessToken);
		System.out.println("personInfo.Id::"+person.getId());
		WebResource getMyconnectionsWebResource = client.resource("https://api.linkedin.com/v1/people/id="+person.getId()+"?format=json&modified=new&oauth2_access_token=" + accessToken);
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
				e.printStackTrace();
			}
		} 
	}




	public void PeopleSearch(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{
		System.out.println("PeopleSearch::");
		Client client = Client.create();
		WebResource getPeopleSearch = client.resource("https://api.linkedin.com/v1/people-search?format=json&sort=connections&oauth2_access_token=" + accessToken);
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
				e.printStackTrace();
			}
		} 


	}

	public void getMyMemberConnectionsById(HttpServletRequest request, HttpServletResponse response, String accessToken) throws ServletException, IOException{

		System.out.println("getMyMemberConnectionsById::");
		//Person personInfo = new Person();
		Client client = Client.create();
		//String auth = request.getParameter("auth");
		Person person =getMyProfile(request, response, accessToken);
		System.out.println("personInfo.Id::"+person.getId());
		WebResource getMyMemberConnectionsWebResource = client.resource("https://api.linkedin.com/v1/people/id="+person.getId()+"/connections?format=json&modified=new&oauth2_access_token=" + accessToken);
		ClientResponse Profile =getMyMemberConnectionsWebResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp1:::::" +Profile);
		if (Profile.getStatus() == 200) {
			String output = Profile.getEntity(String.class);
			System.out.println("output " + output);
			try{
				System.out.println("Inside getMyMemberConnectionsById try::");
				JSONObject jObject = new JSONObject(output);
				List<Person> persons = new ObjectMapper().readValue(jObject.getString("values") , new ObjectMapper().getTypeFactory().constructCollectionType(List.class, Person.class));
				System.out.println(" inside getMyMemberConnectionsById personInfo::"+ persons);
			}catch (Exception e) {
				e.printStackTrace();
			}

		}

	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	
}