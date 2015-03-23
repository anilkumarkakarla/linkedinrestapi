import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FacetsValues {
	
	@JsonProperty(value = "buckets")
	private Buckets buckets;
	
	@JsonProperty(value = "code")
	private String code;
	
	
	@JsonProperty(value = "name")
	private String name;
	
	
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Buckets getBuckets() {
		return buckets;
	}

	public void setBuckets(Buckets buckets) {
		this.buckets = buckets;
	}

	@Override
	public String toString() {
		return "FacetsValues [code=" + code + ", name=" + name + ", buckets="
				+ buckets + "]";
	}

	
	
	
	

}
