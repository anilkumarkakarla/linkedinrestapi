
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.api.client.auth.oauth2.draft10.AccessTokenResponse;
import com.google.gson.Gson;


@WebServlet("/LinkedinResponse")
public class LinkedinResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
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
		 System.out.println("tockenRequest::"+accessToken);
		 
		 HttpPost getAccessTokenRequest = new HttpPost(accessToken);
		 System.out.println("getAccessTokenRequest::"+getAccessTokenRequest);
		 getAccessTokenRequest.addHeader("Accept", "application/json");
		 DefaultHttpClient httpClient = new DefaultHttpClient();  
		 HttpResponse response = httpClient.execute(getAccessTokenRequest);
		 System.out.println("response::"+response);
		 final Gson gson = new Gson();
		 Reader streamReader = new InputStreamReader(response.getEntity().getContent()); 
		 System.out.println("streamReader::"+streamReader);
		 AccessTokenResponse atResponse = gson.fromJson(streamReader, AccessTokenResponse.class);
		 System.out.println("atResponse::"+atResponse);
		 
		 
		 resp.sendRedirect(accessToken);
		
		
	
	}

	/**
	 * Construct the OAuth code callback handler URL.
	 *
	 * @param req the HttpRequest object
	 * @return The constructed request's URL
	 */
	/*public static String getOAuthCodeCallbackHandlerUrl(HttpServletRequest req) {
		String scheme = req.getScheme() + "://";
		String serverName = req.getServerName();
		String serverPort = (req.getServerPort() == 80) ? "" : ":" + req.getServerPort();
		String contextPath = req.getContextPath();
		String servletPath = URL_MAPPING;
		String pathInfo = (req.getPathInfo() == null) ? "" : req.getPathInfo();
		return scheme + serverName + serverPort + contextPath + servletPath + pathInfo;
	}*/

	
	
}





