import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AvailableAction {

	@JsonProperty(value = "_total")
	private int _total;

	@JsonProperty(value = "values")
	private Category values;

	public int get_total() {
		return _total;
	}

	public void set_total(int _total) {
		this._total = _total;
	}

	public Category getValues() {
		return values;
	}

	public void setValues(Category values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "AvailableAction [_total=" + _total + ", values=" + values + "]";
	}



}
