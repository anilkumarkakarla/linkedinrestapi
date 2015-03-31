import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupPosts {

	@JsonProperty(value = "_count")
	private int count;

	@JsonProperty(value = "_start")
	private int start;


	@JsonProperty(value = "_total")
	private int total;	


	@JsonProperty(value = "values")
	private List<GroupPostsValues> values;


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public List<GroupPostsValues> getValues() {
		return values;
	}


	public void setValues(List<GroupPostsValues> values) {
		this.values = values;
	}


	@Override
	public String toString() {
		return "GroupPosts [count=" + count + ", start=" + start + ", total="
				+ total + ", values=" + values + "]";
	}


}
