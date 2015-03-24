
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
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;


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

	}



}





