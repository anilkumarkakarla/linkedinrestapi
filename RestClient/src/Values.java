import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Values {
	
	@JsonProperty(value = "code")
	private String code;
	
	@JsonProperty(value = "count")
	private int count;
	
	
	@JsonProperty(value = "name")
	private String name;
	
	@JsonProperty(value= "selected")
	private boolean selected;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "Values [code=" + code + ", count=" + count + ", name=" + name
				+ ", selected=" + selected + "]";
	}
	

}
