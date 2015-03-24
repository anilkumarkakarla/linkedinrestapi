import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JobBookmark {
	
	@JsonProperty(value = "_total")
	private int total;
	
	@JsonProperty(value = "values")	
	private List<JobValues> jobValues;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<JobValues> getJobValues() {
		return jobValues;
	}

	public void setJobValues(List<JobValues> jobValues) {
		this.jobValues = jobValues;
	}

	@Override
	public String toString() {
		return "JobBookmark [total=" + total + ", jobValues=" + jobValues + "]";
	}

}
