import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SuggestedCompany {
	
	@JsonProperty(value = "_total")
	private int total;	
	
	@JsonProperty(value = "values")
	private List<Jobs> jobs;

	@JsonProperty(value = "locationDescription")
	private String locationDescription;	
	



	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public List<Jobs> getJobs() {
		return jobs;
	}

	public void setJobs(List<Jobs> jobs) {
		this.jobs = jobs;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "SuggestedCompany [total=" + total + ", jobs=" + jobs
				+ ", locationDescription=" + locationDescription + "]";
	}



}
