import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class UserSuggestedGroup {

	@JsonProperty(value = "_total")
	private int _total;

	@JsonProperty(value = "values")
	private UserGroup values;

	public int get_total() {
		return _total;
	}

	public void set_total(int _total) {
		this._total = _total;
	}

	public UserGroup getValues() {
		return values;
	}

	public void setValues(UserGroup values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "UserSuggestedGroup [_total=" + _total + ", values=" + values
				+ "]";
	}


}
