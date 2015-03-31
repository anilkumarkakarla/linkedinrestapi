import org.codehaus.jackson.annotate.JsonProperty;


public class StatisticsValues {

	@JsonProperty(value = "values")
	private int values;

	public int getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "StatisticsValues [values=" + values + "]";
	}
	
}
