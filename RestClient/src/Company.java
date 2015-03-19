import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({"id","firstName", "lastName", "url"})
@JsonIgnoreProperties(ignoreUnknown=true)
public class Company {
	@JsonProperty(value = "id")	
	private String id;
	

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "_key")
	private String key;
	
	
	public String getId() {
		return id;
	}
	
	
	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", key=" + key + "]";
	}

	
}
