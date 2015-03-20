import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class HeaderValues {
	
	@JsonProperty(value = "name")
	private String name;
	
	
	@JsonProperty(value = "value")
	private String value;


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		return "HeaderValues [name=" + name + ", value=" + value + "]";
	}
	

}
