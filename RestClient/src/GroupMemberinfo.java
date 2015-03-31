import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupMemberinfo {
	
	@JsonProperty(value = "_total")
	private int _total;
	
	@JsonProperty(value = "values")
	private List<PostInfo> values;

	public int get_total() {
		return _total;
	}

	public void set_total(int _total) {
		this._total = _total;
	}

	public List<PostInfo> getValues() {
		return values;
	}

	public void setValues(List<PostInfo> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "GroupMemberinfo [_total=" + _total + ", values=" + values + "]";
	}
	
	
	
	
	
	

}
