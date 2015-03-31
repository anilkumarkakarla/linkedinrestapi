import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class NetworkStats {

	@JsonProperty(value = "_total")	
	private int total;

	@JsonProperty(value = "values")	
	private int[] values;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "NetworkStats [total=" + total + ", values="
				+ Arrays.toString(values) + "]";
	}



}
