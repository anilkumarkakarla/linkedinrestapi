
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class UpdateContent {
	@JsonProperty(value = "person")	
	private Person person;
	
	@JsonProperty(value = "currentShare")
	private CurrentShareValues  currentSharevalues;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public CurrentShareValues getCurrentSharevalues() {
		return currentSharevalues;
	}

	public void setCurrentSharevalues(CurrentShareValues currentSharevalues) {
		this.currentSharevalues = currentSharevalues;
	}

	@Override
	public String toString() {
		return "UpdateContent [person=" + person + ", currentSharevalues="
				+ currentSharevalues + "]";
	}
	
}
