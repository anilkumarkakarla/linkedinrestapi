import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class Communications  {
	
	public  void InvitedByEmail (String accessToken){
		
		  StringBuilder requestBody = new StringBuilder();
		  requestBody.append("<?xml version='1.0' encoding='UTF-8'?>");
		  requestBody.append("<mailbox-item>");
		  requestBody.append("<recipients>");
		  requestBody.append("<recipient>");
		  requestBody.append("<person path=\"/people/email=onlytodavid@gmail.com\">");
		  requestBody.append("<first-name>david</first-name>");
		  requestBody.append("<last-name>son</last-name>");
		  requestBody.append("</person>");
		  requestBody.append(" </recipient>");
		  requestBody.append(" </recipients>");
		  requestBody.append("<subject>Invitation to Connect</subject>");
		  requestBody.append("<body>Please join my professional network on LinkedIn.</body>");
		  requestBody.append("<item-content>");
		  requestBody.append("<invitation-request>");
		  requestBody.append("<connect-type>friend</connect-type>");
		  requestBody.append(" </invitation-request>");
		  requestBody.append("</item-content>");
		  requestBody.append("</mailbox-item>");
		    Client client = Client.create();
		  WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/mailbox?oauth2_access_token=" + accessToken);
		  ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		  System.out.println("result:::::::" + resp);
		 }


	public  void InvitedByMemberId (String accessToken){
		
		
		System.out.println("InvitedByMemberId:::::::");
		  StringBuilder requestBody = new StringBuilder();
		  requestBody.append("<?xml version='1.0' encoding='UTF-8'?>");
		  requestBody.append("<mailbox-item>");
		  requestBody.append("<recipients>");
		  requestBody.append("<recipient>");
		  requestBody.append("<person path=\"/people/id=RVIgW9Qw89\" />");
		  requestBody.append("</recipient>");
		  requestBody.append("</recipients>");
		  requestBody.append("<subject>Invitation to Connect</subject>");
		  requestBody.append("<body>Please join my professional network on LinkedIn.</body>");
		  requestBody.append("<item-content>");
		  requestBody.append("<invitation-request>");
		  requestBody.append("<connect-type>friend</connect-type>");
		  requestBody.append("<authorization>");
		  requestBody.append("<name>NAME_SEARCH</name>");
		  requestBody.append(" <value>1Mlb</value>");
		  requestBody.append(" </authorization>");
		  requestBody.append(" </invitation-request>");
		  requestBody.append("</item-content>");
		  requestBody.append("</mailbox-item>");
		    Client client = Client.create();
		  WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/mailbox?oauth2_access_token=" + accessToken);
		  ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		  System.out.println("result:::::::" + resp);
		 }
		

	public  void SendMessage (String accessToken){
		System.out.println("SendMessage:::::::");
		  StringBuilder requestBody = new StringBuilder();
		  requestBody.append("<?xml version='1.0' encoding='UTF-8'?>");
		  requestBody.append("<mailbox-item>");
		  requestBody.append("<recipients>");
		  requestBody.append("<recipient>");
		  requestBody.append("<person path='/people/~' />");
		  requestBody.append("</recipient>");
		  requestBody.append("<recipient>");
		  requestBody.append("<person path=\"/people/NcL1eZFWfO\" />");
		  requestBody.append("</recipient>");
		  requestBody.append("</recipients>");
		  requestBody.append("<subject>Congratulations on your new position.</subject>");
		  requestBody.append("<body>You're certainly not  the best person for the job!</body>");
		  requestBody.append("</mailbox-item>");
		    Client client = Client.create();
		  WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/mailbox?oauth2_access_token=" + accessToken);
		  ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		  System.out.println("result:::::::" + resp);
		 }
}