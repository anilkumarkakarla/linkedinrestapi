import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyLikes {


	@JsonProperty(value = "_total")
	private int total;
	
	@JsonProperty(value = "values")
	private List<CompanyLikeValues> companyLikeValues;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		
	}

	public List<CompanyLikeValues> getCompanyLikeValues() {
		return companyLikeValues;
	}

	public void setCompanyLikeValues(List<CompanyLikeValues> companyLikeValues) {
		this.companyLikeValues = companyLikeValues;
	}

	@Override
	public String toString() {
		return "CompanyLikes [total=" + total + ", companyLikeValues="
				+ companyLikeValues + "]";
	}

	
	
}
