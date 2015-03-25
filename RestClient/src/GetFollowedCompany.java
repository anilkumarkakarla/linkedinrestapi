
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({"id","firstName", "lastName", "url"})
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetFollowedCompany {
	@JsonProperty(value = "_total")	
	private String total;
	
	@JsonProperty(value = "values")	
	private List<Company> company;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "GetFollowedCompany [total=" + total + ", company=" + company
				+ "]";
	}
	
	
	

	
}
