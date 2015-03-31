
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Jobs {
	
	
	@JsonProperty(value = "active")	
	private boolean active;
	
	@JsonProperty(value = "descriptionSnippet")	
	private String description;
	
	
	@JsonProperty(value = "id")	
	private String id;
	
	@JsonProperty(value = "postingTimestamp")	
	private long postingTimestamp;
	
	
	@JsonProperty(value = "company")	
	private Company company;
	
	@JsonProperty(value = "position")
	
	private JobsPosition jobsPosition;
	
	

	public JobsPosition getJobsPosition() {
		return jobsPosition;
	}

	public void setJobsPosition(JobsPosition jobsPosition) {
		this.jobsPosition = jobsPosition;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public Company getCompany() {
		return company;
	}
	
	@JsonProperty(value = "jobPoster")
	private JobPoster jobposter;




	public JobPoster getJobposter() {
		return jobposter;
	}

	public void setJobposter(JobPoster jobposter) {
		this.jobposter = jobposter;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPostingTimestamp() {
		return postingTimestamp;
	}

	public void setPostingTimestamp(long postingTimestamp) {
		this.postingTimestamp = postingTimestamp;
	}

	@Override
	public String toString() {
		return "Jobs [active=" + active + ", description=" + description
				+ ", id=" + id + ", postingTimestamp=" + postingTimestamp
				+ ", company=" + company + ", jobsPosition=" + jobsPosition
				+ ", jobposter=" + jobposter + "]";
	}

	

}
