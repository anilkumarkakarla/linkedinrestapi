

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

/**
 * Servlet implementation class AccessTokenRequest
 */
@WebServlet("/AccessTokenRequest")
public class AccessTokenRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside doGet of AccessTokenRequest");
		//String tockenRequestURI = request.getRequestURI();
		//System.out.println("tockenRequestURI"+tockenRequestURI);
		/*HttpPost getAccessTokenRequest = new HttpPost(tockenRequestURI);
		 System.out.println("getAccessTokenRequest::"+getAccessTokenRequest);
		 getAccessTokenRequest.addHeader("Accept", "application/json");
		 DefaultHttpClient httpClient = new DefaultHttpClient();  
		 HttpResponse resp = httpClient.execute(getAccessTokenRequest);
		 System.out.println("response::"+response);
		 final Gson gson = new Gson();
		 Reader streamReader = new InputStreamReader(response.getEntity().getContent()); 
		 System.out.println("streamReader::"+streamReader);
		 AccessTokenResponse atResponse = gson.fromJson(streamReader, AccessTokenResponse.class);
		 System.out.println("atResponse::"+atResponse);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
