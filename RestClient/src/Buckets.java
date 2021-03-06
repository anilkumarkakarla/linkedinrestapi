import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Buckets {
	
	@JsonProperty(value = "_total")
	private int total;
	
	@JsonProperty(value = "values")
	
	private List<Values> values;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Values> getValues() {
		return values;
	}

	public void setValues(List<Values> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "Buckets [total=" + total + ", values=" + values + "]";
	}
	
	

}
