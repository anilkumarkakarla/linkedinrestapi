
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


@WebServlet("/LinkedinResponse")
public class LinkedinResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String accessToken = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet of LinkedinResponse method");


		//Extract code from request
		String code = request.getParameter("code");
		System.out.println("code::"+code);

		//Request for access token
		accessToken = "https://www.linkedin.com/uas/oauth2/accessToken?grant_type=authorization_code"
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

		ClientServlet  clientServlet = new ClientServlet();
		clientServlet.getMyProfile(accessToken);
		clientServlet.getMyProfileById(accessToken);

		clientServlet.getMyConnection(accessToken);
		clientServlet.PeopleSearch(accessToken);
		clientServlet.getMyMemberConnectionsById(accessToken);
		clientServlet.getOutOfNetworkProfile(accessToken);

		CompanyServlet companyServlet = new CompanyServlet();
		companyServlet.getCompanyById(accessToken);
		companyServlet.getCompanyByUniversalName(accessToken);
		companyServlet.getCompanyByEmailDomain(accessToken);
		companyServlet.getCompanyByIdAndUniversalName(accessToken);
		companyServlet.searchCompanies(accessToken);

		companyServlet.getFollwedCompanies(accessToken);
		companyServlet.getCompanyUpdates(accessToken);
		companyServlet.getStartFollowingCompanies(accessToken);

		JobServlet jobServlet = new JobServlet();
		jobServlet.getJob(accessToken);
		jobServlet.getJobBookmark(accessToken);

		GroupsClientAPI groupsClientAPI = new GroupsClientAPI();
		groupsClientAPI.getGroup(accessToken);
		groupsClientAPI.getGroups(accessToken);
		groupsClientAPI.getUserSuggestedGroups(accessToken);
		groupsClientAPI.getGroupPosts(accessToken);
		groupsClientAPI.getPost(accessToken);
		groupsClientAPI.getGroupSettings(accessToken);
		groupsClientAPI.getComments(accessToken);
		groupsClientAPI.getGroupMemberPosts(accessToken);
		groupsClientAPI.getPostComments(accessToken);
		groupsClientAPI.getDeletedUserSuggestedGroups(accessToken);


		GroupPostAPI groupPostAPI = new GroupPostAPI();
		groupPostAPI.addPostComment(accessToken);
		groupPostAPI.createGroupPost(accessToken);
		groupPostAPI.likePost(accessToken);
		groupPostAPI.disLikePost(accessToken);
		groupPostAPI.followPost(accessToken);
		groupPostAPI.unFollowPost(accessToken);
		groupPostAPI.deleteComments(accessToken);
		groupPostAPI.flagPostAsPromotion(accessToken);
		groupPostAPI.flagPostAsJob(accessToken);
		groupPostAPI.deletePost(accessToken);
		groupPostAPI.joinGroup(accessToken);
		groupPostAPI.putjoinGroup(accessToken);
		groupPostAPI.leaveGroup(accessToken);
		groupPostAPI.updateGroupSettings(accessToken);
	}
}
