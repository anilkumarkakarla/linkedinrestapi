
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Connection {

	@JsonProperty(value = "_total")
	private int total;	

	@JsonProperty(value = "values")
	private List<Person> persons;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Connection [total=" + total + ", persons=" + persons + "]";
	}
	
}