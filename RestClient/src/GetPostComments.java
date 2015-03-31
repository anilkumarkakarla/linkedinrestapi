import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GetPostComments {

	@JsonProperty(value = "creationTimestamp")
	private long creationTimestamp;

	@JsonProperty(value = "creator")
	private Person creator;

	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "id")
	private RelationToViewer relationToViewer;

	@JsonProperty(value = "text")
	private String text;

	public long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Person getCreator() {
		return creator;
	}

	public void setCreator(Person creator) {
		this.creator = creator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RelationToViewer getRelationToViewer() {
		return relationToViewer;
	}

	public void setRelationToViewer(RelationToViewer relationToViewer) {
		this.relationToViewer = relationToViewer;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "GetPostComments [creationTimestamp=" + creationTimestamp
				+ ", creator=" + creator + ", id=" + id + ", relationToViewer="
				+ relationToViewer + ", text=" + text + "]";
	}


}
