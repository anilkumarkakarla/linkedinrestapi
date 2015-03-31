import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class GroupsClientAPI {

	private Group group = null;

	public Group getGroup(String accessToken){
		System.out.println("getGroup::");
		group = new Group();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/groups/6955413?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				group = new ObjectMapper().readValue(result, Group.class);
				System.out.println("Group::::::"+group);
				return group;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return group;
	}

	public Group getGroups(String accessToken){
		System.out.println("getGroups::");
		group = new Group();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				group = new ObjectMapper().readValue(result, Group.class);
				System.out.println("Groups::::::"+group);
				return group;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return group;
	}


	public GroupSetting  getGroupSettings(String accessToken){
		System.out.println("getGroupSettings::");
		GroupSetting groupSettings = new GroupSetting();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships/6955413?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				groupSettings = new ObjectMapper().readValue(result, GroupSetting.class);
				System.out.println("Groups::::::"+groupSettings);
				return groupSettings;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return groupSettings;
	}

	public UserSuggestedGroup getUserSuggestedGroups(String accessToken){
		System.out.println("getUserSuggestedGroups::");
		UserSuggestedGroup	userSuggestedGroups = new UserSuggestedGroup();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/suggestions/groups?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				userSuggestedGroups = new ObjectMapper().readValue(result, UserSuggestedGroup.class);
				System.out.println("Groups::::::"+group);
				return userSuggestedGroups;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return userSuggestedGroups;
	}

	public GroupPosts  getGroupPosts(String accessToken){
		System.out.println("getGroupPosts::");
		GroupPosts	groupPosts = new GroupPosts();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/groups/4287325/posts?format=json&order=recency&category=discussion&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				groupPosts = new ObjectMapper().readValue(result, GroupPosts.class);
				System.out.println("Groups::::::"+group);
				return groupPosts;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return groupPosts;
	}

	public GroupMemberinfo  getGroupMemberPosts(String accessToken){
		System.out.println("getGroupPosts::");
		GroupMemberinfo memberInfo = new GroupMemberinfo();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/group-memberships/6954581/posts?format=json&order=recency&role=creator&category=discussion&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				memberInfo = new ObjectMapper().readValue(result, GroupMemberinfo.class);
				System.out.println("Groups::::::"+group);
				return memberInfo;
			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return memberInfo;
	}


	public Post  getPost(String accessToken){
		System.out.println("getPost::");
		Post post = new Post();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-4287325-S-5986470430435729409?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				post = new ObjectMapper().readValue(result, Post.class);
				System.out.println("Groups::::::"+group);
				return post;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return post;
	}

	public PostComments  getPostComments(String accessToken){
		System.out.println("getPostComments::");
		PostComments postComments = new PostComments();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/posts/g-4287325-S-5984894448432136194/comments?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				postComments = new ObjectMapper().readValue(result, PostComments.class);
				System.out.println("Groups::::::"+group);
				return postComments;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return postComments;
	}

	public Comments  getComments(String accessToken){
		System.out.println("getComments::");
		Comments comment = new Comments();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/comments/g-6955413-S-5987218306111655939-5987230334113038336?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("inside if" + result);
			try{
				System.out.println("Inside try::");
				comment = new ObjectMapper().readValue(result, Comments.class);
				System.out.println("Groups::::::"+group);
				return comment;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			} 

		}
		return comment;

	}

	public DeleteUserSuggestedGroup  getDeletedUserSuggestedGroups(String accessToken){
		System.out.println("getJob::");
		DeleteUserSuggestedGroup deleteUserSuggestedGroup = new DeleteUserSuggestedGroup();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/jobs/1337?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("output:::::::" + output);
			try{
				System.out.println("Inside try::");
				deleteUserSuggestedGroup = new ObjectMapper().readValue(output, DeleteUserSuggestedGroup.class);
				System.out.println("company::::::"+deleteUserSuggestedGroup);
				return deleteUserSuggestedGroup;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}

		}
		return deleteUserSuggestedGroup;

	}
}
