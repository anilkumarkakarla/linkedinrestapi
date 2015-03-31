import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class GroupPostAPI {


	public void  addPostComment(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<comment><text>DevOps is a good technology</text></comment>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6955413-S-5987199792227303426/comments?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void createGroupPost(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<post><title>Learn cloud technology</title><summary>AWS is most popular cloud technology</summary></post>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/groups/6955413/posts?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void likePost(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<is-liked>true</is-liked>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6955413-S-5987218306111655939/relation-to-viewer/is-liked?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void disLikePost(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<is-liked>true</is-liked>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6955413-S-5987218306111655939/relation-to-viewer/is-liked?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}


	public void followPost(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<is-following>true</is-following>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6955413-S-5987218306111655939/relation-to-viewer/is-following?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}


	public void unFollowPost(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<is-following>false</is-following>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6955413-S-5987218306111655939/relation-to-viewer/is-following?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void deleteComments(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/comments/g-6954581-S-5988191447101235200-5988192616129245184?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").delete(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);

	}

	public void flagPostAsPromotion(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<code>promotion</code>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6954581-S-5988191447101235200/category/code?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void flagPostAsJob(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<code>job</code>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6954581-S-5988191447101235200/category/code?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void deletePost(String accessToken){
		StringBuilder requestBody = new StringBuilder();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-6954581-S-5988207926555193346?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").delete(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void  joinGroup(String accessToken){
		System.out.println("joinGroup:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version='1.0' encoding='UTF-8'?>");
		requestBody.append("<group-membership>");
		requestBody.append("<group>");
		requestBody.append("<id>6954581</id>");
		requestBody.append("</group>");
		requestBody.append("<show-group-logo-in-profile>true</show-group-logo-in-profile>");
		requestBody.append("<email-digest-frequency>");
		requestBody.append("<code>daily</code>");
		requestBody.append("</email-digest-frequency>");
		requestBody.append("<email-announcements-from-managers>true</email-announcements-from-managers>");
		requestBody.append("<allow-messages-from-members>true</allow-messages-from-members>");
		requestBody.append("<email-for-every-new-post>false</email-for-every-new-post>");
		requestBody.append("<membership-state>");
		requestBody.append("<code>member</code>");
		requestBody.append("</membership-state>");
		requestBody.append("</group-membership>");


		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void  putjoinGroup(String accessToken){
		System.out.println("putjoinGroup joinGroup:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version='1.0' encoding='UTF-8'?>");
		requestBody.append("<group-membership>");
		requestBody.append("<membership-state>");
		requestBody.append("<code>member</code>");
		requestBody.append("</membership-state>");
		requestBody.append("</group-membership>");

		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships/6954581?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}



	public void  leaveGroup(String accessToken){
		System.out.println("putjoinGroup leaveGroup:::::::");
		StringBuilder requestBody = new StringBuilder();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships/6954581?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").delete(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}

	public void  updateGroupSettings(String accessToken){
		System.out.println("updateGroupSettings::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		requestBody.append("<group-membership>");
		requestBody.append("<show-group-logo-in-profile>true</show-group-logo-in-profile>");
		requestBody.append("<email-digest-frequency>");
		requestBody.append("<code>daily</code>");
		requestBody.append("</email-digest-frequency>");
		requestBody.append("<email-announcements-from-managers>true</email-announcements-from-managers>");
		requestBody.append("<allow-messages-from-members>true</allow-messages-from-members>");
		requestBody.append("<email-for-every-new-post>true</email-for-every-new-post>");
		requestBody.append("</group-membership>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships/8280358?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").put(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);

	}



}

