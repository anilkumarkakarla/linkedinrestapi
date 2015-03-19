
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({"id","firstName", "lastName", "url"})
@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {

	@JsonProperty(value = "id")	
	private String id;

	@JsonProperty(value = "firstName")
	private String firstName;

	@JsonProperty(value = "lastName")	
	private String lastName;

	@JsonProperty(value = "industry")
	private String industry;

	@JsonProperty(value = "headline")
	private String headline;

	@JsonProperty(value = "pictureUrl")
	private String pictureUrl;

	/*@JsonProperty(value = "siteStandardProfileRequest")
	private String siteStandardProfileRequest;*/
	
	@JsonProperty(value="location")
	private Location location;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	/*public String getSiteStandardProfileRequest() {
		return siteStandardProfileRequest;
	}

	public void setSiteStandardProfileRequest(String siteStandardProfileRequest) {
		this.siteStandardProfileRequest = siteStandardProfileRequest;
	}*/

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", industry=" + industry + ", headline="
				+ headline + ", pictureUrl=" + pictureUrl
				/*+ ", siteStandardProfileRequest=" + siteStandardProfileRequest*/
				+ ", location=" + location + "]";
	}

}