import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PostComments {

	@JsonProperty(value = "_total")
	private int _total;

	@JsonProperty(value = "values")
	private List<GetPostComments> values;

	public int get_total() {
		return _total;
	}

	public void set_total(int _total) {
		this._total = _total;
	}

	public List<GetPostComments> getValues() {
		return values;
	}

	public void setValues(List<GetPostComments> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "PostComments [_total=" + _total + ", values=" + values + "]";
	}

}
