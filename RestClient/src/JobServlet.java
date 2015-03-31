import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class JobServlet  {
	public JobBookmark getJobBookmark(String accessToken) {
		System.out.println("JobBookmark::");
		JobBookmark jobBookmark = new JobBookmark();
		Client client = Client.create();
		
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/job-bookmarks?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("output:::::::" + output);
			try{
				System.out.println("Inside try::");
				jobBookmark = new ObjectMapper().readValue(output, JobBookmark.class);
				System.out.println("company::::::"+jobBookmark);
				return jobBookmark;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}

		}
		return jobBookmark;

	}



	public Jobs getJob(String accessToken) {
		System.out.println("getJob::");
		Jobs jobs = new Jobs();
		Client client = Client.create();

		WebResource webResource = client.resource("https://api.linkedin.com/v1/jobs/1337?format=json&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String output = resp.getEntity(String.class);
			System.out.println("output:::::::" + output);
			try{
				System.out.println("Inside try::");
				jobs = new ObjectMapper().readValue(output, Jobs.class);
				System.out.println("company::::::"+jobs);
				return jobs;

			}catch (Exception e) {
				System.out.println("Exception" + e);
			}

		}
		return jobs;
	}	

	public Output searchJobs(String accessToken) {
		System.out.println("searchJobs::");
		Output output = new Output();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/job-search?format=json&sort=R&oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
		System.out.println("resp:::::" + resp);
		if (resp.getStatus() == 200) {
			String result = resp.getEntity(String.class);
			System.out.println("result:::::::" + result);
			try{
				System.out.println("Inside try::");
				output = new ObjectMapper().readValue(result, Output.class);
				System.out.println("company::::::"+output);
				return output;

			}catch (Exception e) {
				System.out.println("Exception" + e);
				e.printStackTrace();
			}
		}
		return output;
	}	



	public void addJobBookMark(String accessToken) { 
		System.out.println("addJobBookMark:::::::");
		StringBuilder requestBody = new StringBuilder();
		requestBody.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		requestBody.append("<job-bookmark>");
		requestBody.append("<job>");
		requestBody.append("<id>2924431</id>");
		requestBody.append("</job>");
		requestBody.append("</job-bookmark>");
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/job-bookmarks?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").post(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}


	public void removeJobBookMark(String accessToken){ 
		System.out.println("removeJobBookMark:::::::");
		StringBuilder requestBody = new StringBuilder();
		Client client = Client.create();
		WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~/job-bookmarks/2924431?oauth2_access_token=" + accessToken);
		ClientResponse resp = webResource.type("application/xml").delete(ClientResponse.class, requestBody.toString());
		System.out.println("result:::::::" + resp);
	}
}
