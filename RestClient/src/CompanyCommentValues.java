import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyCommentValues {
	
	
	@JsonProperty(value = "comment")
	private String  comment;
	
	@JsonProperty(value = "id")
	private long id;
	
	@JsonProperty(value = "likes")
	private List<CompanyLikes> companyLikes;
	
	@JsonProperty(value = "person")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	public List<CompanyLikes> getCompanyLikes() {
		return companyLikes;
	}


	public void setCompanyLikes(List<CompanyLikes> companyLikes) {
		this.companyLikes = companyLikes;
	}


	@JsonProperty(value = "sequenceNumber")
	private int sequenceNumber;
	
	
	


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getSequenceNumber() {
		return sequenceNumber;
	}


	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}



	@Override
	public String toString() {
		return "CompanyCommentValues [comment=" + comment + ", id=" + id
				+ ", companyLikes=" + companyLikes + ", person=" + person
				+ ", sequenceNumber=" + sequenceNumber + "]";
	}


	
	
	
}
