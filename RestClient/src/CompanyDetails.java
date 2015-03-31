import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyDetails {
	
	@JsonProperty(value = "company")	
	private List<Company> company;
	
	@JsonProperty(value = "descriptionSnippet")	
	private String description;
	
	@JsonProperty(value = "id")	
	private String id;
	
	@JsonProperty(value = "jobPoster")	
	private List<JobPoster> jobPoster;
	
	
	@JsonProperty(value = "locationDescription")	
	private String locationDescription;
	
	
	

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<JobPoster> getJobPoster() {
		return jobPoster;
	}

	public void setJobPoster(List<JobPoster> jobPoster) {
		this.jobPoster = jobPoster;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	@Override
	public String toString() {
		return "CompanyDetails [company=" + company + ", description="
				+ description + ", id=" + id + ", jobPoster=" + jobPoster
				+ ", locationDescription=" + locationDescription + "]";
	}

	
	
	

}
