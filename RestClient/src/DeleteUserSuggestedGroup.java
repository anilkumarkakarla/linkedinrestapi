import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DeleteUserSuggestedGroup {
	
	@JsonProperty(value = "active")
	private String active;
	
	@JsonProperty(value = "company")
	private  Company company;
	
	@JsonProperty(value = "descriptionSnippet")
	private String descriptionSnippet;
	
	@JsonProperty(value = "id")
	private int id;
	
	@JsonProperty(value = "position")
	private JobsPosition position;
	
	@JsonProperty(value = "postingTimestamp")
	private long postingTimestamp;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getDescriptionSnippet() {
		return descriptionSnippet;
	}

	public void setDescriptionSnippet(String descriptionSnippet) {
		this.descriptionSnippet = descriptionSnippet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobsPosition getPosition() {
		return position;
	}

	public void setPosition(JobsPosition position) {
		this.position = position;
	}

	public long getPostingTimestamp() {
		return postingTimestamp;
	}

	public void setPostingTimestamp(long postingTimestamp) {
		this.postingTimestamp = postingTimestamp;
	}

	@Override
	public String toString() {
		return "DeleteUserSuggestedGroup [active=" + active + ", company="
				+ company + ", descriptionSnippet=" + descriptionSnippet
				+ ", id=" + id + ", position=" + position
				+ ", postingTimestamp=" + postingTimestamp + "]";
	}
	

}
