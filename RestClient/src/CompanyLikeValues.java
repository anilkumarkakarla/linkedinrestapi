import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class  CompanyLikeValues {


	
	@JsonProperty(value = "person")
	private List<Person> persons;

	
		
	

	public List<Person> getPersons() {
		return persons;
	}





	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}





	@Override
	public String toString() {
		return "CompanyLikeValues [persons=" + persons + "]";
	}





	
	
}
