import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JobValues {
	
	
	@JsonProperty(value = "isApplied")	
	private boolean Applied;
	
	@JsonProperty(value = "isSaved")	
	private boolean Saved;
	
	@JsonProperty(value = "savedTimestamp")	
	private long Timestamp;
	
	@JsonProperty(value = "job")	
	private Jobs jobs;
	
	

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public boolean isApplied() {
		return Applied;
	}

	public void setApplied(boolean applied) {
		Applied = applied;
	}

	public boolean isSaved() {
		return Saved;
	}

	public void setSaved(boolean saved) {
		Saved = saved;
	}

	public long isTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(long timestamp) {
		Timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "JobValues [Applied=" + Applied + ", Saved=" + Saved
				+ ", Timestamp=" + Timestamp + ", jobs=" + jobs + "]";
	}

	
	
	
	
	
	

}
