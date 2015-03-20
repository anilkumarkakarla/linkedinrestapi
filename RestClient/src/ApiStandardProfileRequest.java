import org.codehaus.jackson.annotate.JsonProperty;


public class ApiStandardProfileRequest {
	
	@JsonProperty(value = "headers")
	private Header headers;
	
	
	
	@JsonProperty(value = "url")
	private String url;



	public Header getHeaders() {
		return headers;
	}



	public void setHeaders(Header headers) {
		this.headers = headers;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	@Override
	public String toString() {
		return "ApiStandardProfileRequest [headers=" + headers + ", url=" + url
				+ "]";
	}
	
	

}
