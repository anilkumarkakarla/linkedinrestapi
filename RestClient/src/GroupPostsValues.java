import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupPostsValues {
   
	
	@JsonProperty(value = "creator")	
	private Person creator;

	public Person getCreator() {
		return creator;
	}

	public void setCreator(Person creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "GroupPostsValues [creator=" + creator + "]";
	}
	
	
}
