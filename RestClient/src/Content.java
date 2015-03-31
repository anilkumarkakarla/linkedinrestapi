
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Content {
	@JsonProperty(value = "description")	
	private String description;

	@JsonProperty(value = "eyebrowUrl")
	private String eyebrowUrl;

	@JsonProperty(value = "resolvedUrl")
	private String resolvedUrl;

	@JsonProperty(value = "shortenedUrl")
	private String shortenedUrl;

	@JsonProperty(value = "submittedImageUrl")
	private String submittedImageUrl;

	@JsonProperty(value = "submittedUrl")
	private String submittedUrl;

	@JsonProperty(value = "thumbnailUrl")
	private String thumbnailUrl;

	@JsonProperty(value = "title")
	private String title;

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEyebrowUrl() {
		return eyebrowUrl;
	}


	public void setEyebrowUrl(String eyebrowUrl) {
		this.eyebrowUrl = eyebrowUrl;
	}


	public String getResolvedUrl() {
		return resolvedUrl;
	}


	public void setResolvedUrl(String resolvedUrl) {
		this.resolvedUrl = resolvedUrl;
	}


	public String getShortenedUrl() {
		return shortenedUrl;
	}


	public void setShortenedUrl(String shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}


	public String getSubmittedImageUrl() {
		return submittedImageUrl;
	}


	public void setSubmittedImageUrl(String submittedImageUrl) {
		this.submittedImageUrl = submittedImageUrl;
	}


	public String getSubmittedUrl() {
		return submittedUrl;
	}


	public void setSubmittedUrl(String submittedUrl) {
		this.submittedUrl = submittedUrl;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Content [description=" + description + ", eyebrowUrl="
				+ eyebrowUrl + ", resolvedUrl=" + resolvedUrl
				+ ", shortenedUrl=" + shortenedUrl + ", submittedImageUrl="
				+ submittedImageUrl + ", submittedUrl=" + submittedUrl
				+ ", thumbnailUrl=" + thumbnailUrl + ", title=" + title + "]";
	}




}
