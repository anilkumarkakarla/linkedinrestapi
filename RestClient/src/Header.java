import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Header {
	
	@JsonProperty(value = "_total")
	private int total;
	
	@JsonProperty(value = "values")
	private List<HeaderValues> headerValues;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<HeaderValues> getHeaderValues() {
		return headerValues;
	}

	public void setHeaderValues(List<HeaderValues> headerValues) {
		this.headerValues = headerValues;
	}

	@Override
	public String toString() {
		return "Header [total=" + total + ", headerValues=" + headerValues
				+ "]";
	}
	
	

}
