
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


@WebServlet("/LinkedinResponse")
public class LinkedinResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ACCESS_TOKEN = "ACCESS_TOKEN";
	//public static final String URL_MAPPING = "/callback";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet of LinkedinResponse method");

		// Construct incoming request URL
		//String requestUrl = getOAuthCodeCallbackHandlerUrl(req);

		//Extract code from request
		String code = req.getParameter("code");
		System.out.println("code::"+code);

		//Request for access token
		String accessToken = "https://www.linkedin.com/uas/oauth2/accessToken?grant_type=authorization_code"
				+ "&code="+code+"&redirect_uri=http://localhost:8080/RestClient/callback&client_id=77ywtoz3eay8jk&client_secret=qvP3Jh0mHBkUs80i";

		HttpClient httpclient = new HttpClient();
		PostMethod post = new PostMethod(accessToken);

		try {

			httpclient.executeMethod(post);
			try {
				JSONObject authResponse = new JSONObject(
						new JSONTokener(new InputStreamReader(
								post.getResponseBodyAsStream())));
				System.out.println("Auth response: "
			                                 + authResponse.toString(2));

				accessToken = authResponse.getString("access_token");
				System.out.println("Got access token: " + accessToken);

			} catch (JSONException e) {
				e.printStackTrace();
				throw new ServletException(e);

			}

		} finally {

			post.releaseConnection();
		}
		
		//req.getSession().setAttribute(ACCESS_TOKEN, accessToken);
		//resp.sendRedirect(accessToken);
		accessToken= "AQW4lEJY0OD6m4o_NsPXJ-tT-jotVMBLQpizAQUkwZDCxyU-U6RSkGd-RgNQyYVbeADXxVri00HrjfuLokOjnsJP4TncigalKZg2BF-_XOl_TFO-V9LdLwyjiZPeVK6FIsE2oBwtw6RzkCVhem7U5H05Xzdv-icreTmlDIVVXvQGzgF0QRI";
		
		//JobServlet jobServlet = new JobServlet();
        //jobServlet.getJobBookmark(req, resp, accessToken);
		//jobServlet.getMemberSuggestedJobs(req, resp, accessToken);
		
		CompanyServlet companyServlet = new CompanyServlet();
		companyServlet.getCompanyUpdates(accessToken);
		//companyServlet. getStartFollowingCompanies(req, resp, accessToken);
		
		//GroupServlet groupServlet = new GroupServlet();
		//groupServlet.getDeletedUserSuggestedGroups(req, resp, accessToken);
	
		//NetworkUpdates networkUpdates = new NetworkUpdates();
		//networkUpdates.getNetworkUpdates(accessToken);
		//networkUpdates.getMemberNetworkUpdates(req, resp, accessToken);
		//networkUpdates.getNetworkStatistics(req, resp, accessToken);
		try {
			//networkUpdates.PostNetworkUpdates(accessToken);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		//ClientServlet clientServlet = new ClientServlet();
		//clientServlet.getMyMemberConnectionsById(req, resp, accessToken);
		
		//Communications communications  = new Communications();
		try {
			//communications.InvitedByEmail(accessToken);
			//communications.InvitedByMemberId(accessToken);
		    //communications.SendMessage(accessToken);

        
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
}


	}
