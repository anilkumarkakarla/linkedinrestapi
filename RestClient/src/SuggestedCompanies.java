
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class SuggestedCompanies {
	@JsonProperty(value = "_count")
	private int count;

	@JsonProperty(value = "_start")
	private int start;


	@JsonProperty(value = "_total")
	private int total;	

	@JsonProperty(value = "values")
	private List<Company> company;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
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
		return "SuggestedCompanies [count=" + count + ", start=" + start
				+ ", total=" + total + ", company=" + company + "]";
	}

}
