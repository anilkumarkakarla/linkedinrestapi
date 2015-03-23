
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({"id","firstName", "lastName", "url"})
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompaniesGroup {
	@JsonProperty(value = "_count")
	private int count;
	
	@JsonProperty(value = "_start")
	private int start;
	
	
	@JsonProperty(value = "_total")
	private int total;	

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

	@JsonProperty(value = "values")
	private List<Company> companies;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Companies [count=" + count + ", start=" + start + ", total="
				+ total + ", companies=" + companies + "]";
	}

	

}
