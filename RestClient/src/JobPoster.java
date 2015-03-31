import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JobPoster {
	
	
	@JsonProperty(value = "firstName")
	private String firstName;

	@JsonProperty(value = "headline")
	private String headline;

	@JsonProperty(value = "id")	
	private String id;
	
	@JsonProperty(value = "lastName")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "JobPoster [firstName=" + firstName + ", headline=" + headline
				+ ", id=" + id + ", lastName=" + lastName + "]";
	}



}
