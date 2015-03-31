import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class NetworkStatistics {
	
	@JsonProperty(value = "_total")
	private int total;
	
@JsonProperty(value = "values")
	
	private int[] statisticsvalues;

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}



public int[] getStatisticsvalues() {
	return statisticsvalues;
}

public void setStatisticsvalues(int[] statisticsvalues) {
	this.statisticsvalues = statisticsvalues;
}

@Override
public String toString() {
	return "NetworkStatistics [total=" + total + ", statisticsvalues="
			+ Arrays.toString(statisticsvalues) + "]";
}




}
