import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Facets {
	
	
	@JsonProperty(value = "_total")
	private int total;
	
	@JsonProperty(value = "values")
	private List<FacetsValues> facetsValues;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<FacetsValues> getFacetsValues() {
		return facetsValues;
	}

	public void setFacetsValues(List<FacetsValues> facetsValues) {
		this.facetsValues = facetsValues;
	}

	@Override
	public String toString() {
		return "Facets [total=" + total + ", facetsValues=" + facetsValues
				+ "]";
	}
	
	

}
