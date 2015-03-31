import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyValues {
	
	
	@JsonProperty(value = "isCommentable")
	private boolean isCommentable;
	
	@JsonProperty(value = "isLikable")
	private boolean isLikable;
	
	
	@JsonProperty(value = "isLiked")
	private boolean isLiked;


	@JsonProperty(value = "numLikes")
	private int numLikes;
	
	@JsonProperty(value = "timestamp")
	private long timestamp;


	@JsonProperty(value = "likes")
	private CompanyLikes companyLikes;
	
	@JsonProperty(value = "locationDescription")	
	private String locationDescription;
	
	
	
	public int getNumLikes() {
		return numLikes;
	}


	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}


	public long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}


	public String getLocationDescription() {
		return locationDescription;
	}


	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}


	public CompanyLikes getCompanyLikes() {
		return companyLikes;
	}


	public void setCompanyLikes(CompanyLikes companyLikes) {
		this.companyLikes = companyLikes;
	}




	


	public boolean isCommentable() {
		return isCommentable;
	}


	public void setCommentable(boolean isCommentable) {
		this.isCommentable = isCommentable;
	}


	public boolean isLikable() {
		return isLikable;
	}


	public void setLikable(boolean isLikable) {
		this.isLikable = isLikable;
	}


	public boolean isLiked() {
		return isLiked;
	}


	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}


	@Override
	public String toString() {
		return "CompanyValues [isCommentable=" + isCommentable + ", isLikable="
				+ isLikable + ", isLiked=" + isLiked + ", numLikes=" + numLikes
				+ ", timestamp=" + timestamp + ", companyLikes=" + companyLikes
				+ ", locationDescription=" + locationDescription + "]";
	}
	
}
