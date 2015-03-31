import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Group {
	@JsonProperty(value = "id")
	private int id;

	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "_total")
	private int _total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get_total() {
		return _total;
	}

	public void set_total(int _total) {
		this._total = _total;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", _total=" + _total
				+ "]";
	}



}
