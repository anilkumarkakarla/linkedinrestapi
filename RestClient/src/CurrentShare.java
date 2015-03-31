
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class CurrentShare {
	
	
	@JsonProperty(value = "currentShare")
	private CurrentShareValues  currentSharevalues;

	public CurrentShareValues getCurrentSharevalues() {
		return currentSharevalues;
	}

	public void setCurrentSharevalues(CurrentShareValues currentSharevalues) {
		this.currentSharevalues = currentSharevalues;
	}

	@Override
	public String toString() {
		return "CurrentShare [currentSharevalues=" + currentSharevalues + "]";
	}
	
}
