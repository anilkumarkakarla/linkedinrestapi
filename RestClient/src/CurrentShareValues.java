
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class CurrentShareValues {
	@JsonProperty(value = "comment")
	private String  comment;
	
	@JsonProperty(value = "id")
	private String  id;
	
	@JsonProperty(value = "timestamp")
	private long  timestamp;
	
	@JsonProperty(value = "author")
	private Person  author;
	
	@JsonProperty(value = "content")
	private Content  content;
	
	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "CurrentShareValues [comment=" + comment + ", id=" + id
				+ ", timestamp=" + timestamp + ", author=" + author
				+ ", content=" + content + "]";
	}
}
