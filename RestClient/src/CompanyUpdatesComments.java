import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyUpdatesComments {
	@JsonProperty(value = "_total")
	private int total;
	
	
	
	@JsonProperty(value = "values")
	private List<CompanyCommentValues> companyCommentValues;



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public List<CompanyCommentValues> getCompanyCommentValues() {
		return companyCommentValues;
	}



	public void setCompanyCommentValues(
			List<CompanyCommentValues> companyCommentValues) {
		this.companyCommentValues = companyCommentValues;
	}



	@Override
	public String toString() {
		return "CompanyUpdatesComments [total=" + total
				+ ", companyCommentValues=" + companyCommentValues + "]";
	}

}
