import java.io.IOException;

import javax.servlet.ServletException;
import org.codehaus.jackson.map.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class SocialStream {


	public CurrentShare getCurrentShare(String accessToken){
		System.out.println("getCurrentShare::");
		CurrentShare currentShare = new CurrentShare();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~:(current-share)?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				currentShare = new ObjectMapper().readValue(result, CurrentShare.class);
				System.out.println("company::::::"+currentShare);
				return currentShare;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}
		}
		return currentShare;
	}



	public ShareStream getMyShareStream(String accessToken) {
		System.out.println("getMyShareStream::");
		ShareStream shareStream = new ShareStream();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network?format=json&type=SHAR&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				shareStream = new ObjectMapper().readValue(result, ShareStream.class);
				System.out.println("company::::::"+shareStream);
				return shareStream;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}
		}
		return shareStream;
	}


	public ShareStream getMemberStreamsById(String accessToken){
		System.out.println("getMemberStreamsById:");
		ShareStream shareStream = new ShareStream();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/NcL1eZFWfO/network?format=json&type=SHAR&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				shareStream = new ObjectMapper().readValue(result, ShareStream.class);
				System.out.println("company::::::"+shareStream);
				return shareStream;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return shareStream;
	}


	public void addShare(String accessToken) { 
		System.out.println("addShare:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		requestBody.append("<share>");
		requestBody.append("<comment>83% of employers will use social media to hire: 78% LinkedIn, 55% Facebook, 45% Twitter [SF Biz Times] http://bit.ly/cCpeOD</comment>");
		requestBody.append("<content>");
		requestBody.append("<title>Survey: Social networks top hiring tool - San Francisco Business Times</title>");
		requestBody.append("<submitted-url>http://sanfrancisco.bizjournals.com/sanfrancisco/stories/2010/06/28/daily34.html</submitted-url>");
		requestBody.append("<submitted-image-url>http://images.bizjournals.com/travel/cityscapes/thumbs/sm_sanfrancisco.jpg</submitted-image-url>");
		requestBody.append("</content>");
		requestBody.append("<visibility>");
		requestBody.append("<code>anyone</code>");
		requestBody.append("</visibility>");
		requestBody.append("</share>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/shares?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);

	}

	public void reShare(String accessToken) { 
		System.out.println("reShare:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		requestBody.append("<share>");
		requestBody.append("<comment>Check out this story! I can't believe it. hello</comment>");
		requestBody.append("<attribution>");
		requestBody.append("<share>");
		requestBody.append("<id>s1069142555</id>");
		requestBody.append("</share>");
		requestBody.append("</attribution>");
		requestBody.append("<visibility>");
		requestBody.append("<code>connections-only</code>");
		requestBody.append("</visibility>");
		requestBody.append("</share>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/shares?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void postComments(String accessToken){ 
		System.out.println("postComments:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		requestBody.append("<update-comment>");
		requestBody.append("<comment>Save me a trout, Anil!</comment>");
		requestBody.append("</update-comment>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/updates/key=UPDATE-300829900-5987210283179876352/update-comments?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void likeComment(String accessToken) { 
		System.out.println("likeComment:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		requestBody.append("<is-liked>true</is-liked>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/updates/key=UPDATE-300829900-5987210283179876352/is-liked?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void dislikeComment(String accessToken){ 
		System.out.println("dislikeComment:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		requestBody.append("<is-liked>false</is-liked>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/updates/key=UPDATE-300829900-5987210283179876352/is-liked?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}


	public CompanyUpdatesComments getComments(String accessToken) throws ServletException, IOException{
		System.out.println("getComments:");
		CompanyUpdatesComments companyUpdatesComments = new CompanyUpdatesComments();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/updates/key=UPDATE-300829900-5987210283179876352/update-comments?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				companyUpdatesComments = new ObjectMapper().readValue(result, CompanyUpdatesComments.class);
				System.out.println("company::::::"+companyUpdatesComments);
				return companyUpdatesComments;
			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return companyUpdatesComments;
	}


	public CompanyLikes getLikes(String accessToken) throws ServletException, IOException{
		System.out.println("getLikes:");
		CompanyLikes companyLikes = new CompanyLikes();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/network/updates/key=UPDATE-300829900-5987210283179876352/likes?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				companyLikes = new ObjectMapper().readValue(result, CompanyLikes.class);
				System.out.println("companylikes::::::"+companyLikes);
				return companyLikes;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return companyLikes;
	}

}
