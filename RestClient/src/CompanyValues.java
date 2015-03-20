import org.codehaus.jackson.annotate.JsonProperty;


public class CompanyValues {
	
	
	@JsonProperty(value = "isCommentable")
	private boolean isCommentable;
	
	@JsonProperty(value = "isLikable")
	private boolean isLikable;
	
	
	@JsonProperty(value = "isLiked")
	private boolean isLiked;


	@JsonProperty(value = "numLikes")
	private boolean numLikes;
	
	@JsonProperty(value = "timestamp")
	private boolean timestamp;


	@JsonProperty(value = "likes")
	private CompanyLikes companyLikes;
	
	public CompanyLikes getCompanyLikes() {
		return companyLikes;
	}


	public void setCompanyLikes(CompanyLikes companyLikes) {
		this.companyLikes = companyLikes;
	}


	public boolean isNumLikes() {
		return numLikes;
	}


	public void setNumLikes(boolean numLikes) {
		this.numLikes = numLikes;
	}


	public boolean isTimestamp() {
		return timestamp;
	}


	public void setTimestamp(boolean timestamp) {
		this.timestamp = timestamp;
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
				+ "]";
	}
	
}
