import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class  CompanyLikeValues {


	
	@JsonProperty(value = "person")
	private Person persons;

	@JsonProperty(value = "timestamp")
	private long timestamp;


	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Person getPersons() {
		return persons;
	}





	public void setPersons(Person persons) {
		this.persons = persons;
	}





	@Override
	public String toString() {
		return "CompanyLikeValues [persons=" + persons + ", timestamp="
				+ timestamp + "]";
	}





	
	
}
