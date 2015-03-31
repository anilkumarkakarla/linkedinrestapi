import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PostInfo {

	@JsonProperty(value = "creator")	
	private Person creator;

	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "title")
	private String title;

	@JsonProperty(value = "type")
	private Category type;

	public Person getCreator() {
		return creator;
	}

	public void setCreator(Person creator) {
		this.creator = creator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getType() {
		return type;
	}

	public void setType(Category type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PostInfo [creator=" + creator + ", id=" + id + ", title="
				+ title + ", type=" + type + "]";
	}







}
