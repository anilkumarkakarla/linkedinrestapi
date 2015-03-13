import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        // TODO Auto-generated method stub
        //String auth="AQVeZ5W2vrnZGnusU9-ypsfcmRPqEf8TXpPme2fdByA2SVl28rl2FIhWquYpbqwLfnPSHvN594S8lonMaaldQOW4qPTdbkSoabfMcsspob6ueshFfilQUeiy-cKVk9WUzdPVA4wJTFjv89lU-0uhm-JZGTpTK2bN7N7JPSIQZQ_8vfP8Sn4";
        String auth = request.getParameter("auth");

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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
}