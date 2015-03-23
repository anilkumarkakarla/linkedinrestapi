import org.codehaus.jackson.annotate.JsonProperty;


public class Country {

	@JsonProperty(value = "code")	
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + "]";
	}

}
