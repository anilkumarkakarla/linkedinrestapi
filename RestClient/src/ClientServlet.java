import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.code.linkedinapi.client.oauth.LinkedInOAuthService;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthServiceFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInRequestToken;
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
        System.out.println("Inside doGet method");
        LinkedInOAuthService oauthService = LinkedInOAuthServiceFactory.getInstance().createLinkedInOAuthService("77ywtoz3eay8jk", "qvP3Jh0mHBkUs80i");
        System.out.println("oauthService String::" + oauthService.toString());
        System.out.println("oauthService::" + oauthService.getOAuthRequestToken());
        System.out.println("oauthService::" + oauthService.getRequestHeaders());
        LinkedInRequestToken requestToken = oauthService.getOAuthRequestToken("http://localhost:8010/RestClient/callback");
        String authUrl = requestToken.getAuthorizationUrl();
        System.out.println("authUrl::" + authUrl);
    }


/*
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Inside doGet method");
        String auth = "";
        System.out.println("Inside doGet method");
        Client client = Client.create();
        WebResource webResource = client.resource("https://api.linkedin.com/v1/people/~?oauth2_access_token=" + auth);
        ClientResponse resp = webResource.accept("text/html").get(ClientResponse.class);
        System.out.println("resp:::::" + resp);
        if (resp.getStatus() == 200) {
            String output = resp.getEntity(String.class);
            System.out.println("inside if" + output);
            //JsonGenerator out = resp.getEntity(JsonGenerator.class);
        }
    }
*/

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}