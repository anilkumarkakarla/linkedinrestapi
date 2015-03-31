import org.codehaus.jackson.annotate.JsonProperty;


public class ApiValues {

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "value")
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ApiValues [name=" + name + ", value=" + value + "]";
	}

	
}
