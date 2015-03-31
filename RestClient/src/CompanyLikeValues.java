import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class  CompanyLikeValues {


	
	@JsonProperty(value = "person")
	private Person persons;

	
		
	

	public Person getPersons() {
		return persons;
	}





	public void setPersons(Person persons) {
		this.persons = persons;
	}





	@Override
	public String toString() {
		return "CompanyLikeValues [persons=" + persons + "]";
	}





	
	
}
