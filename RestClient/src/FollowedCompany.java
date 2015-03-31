import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FollowedCompany {


	@JsonProperty(value = "_total")
	private int total;	
	
	@JsonProperty(value = "values")
	private List<Followed> followed;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Followed> getFollowed() {
		return followed;
	}

	public void setFollowed(List<Followed> followed) {
		this.followed = followed;
	}

	@Override
	public String toString() {
		return "FollowedCompany [total=" + total + ", followed=" + followed
				+ "]";
	}

}
