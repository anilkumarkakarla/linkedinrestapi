import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ApiStandardProfileRequest {
	
	@JsonProperty(value = "headers")
	private Header headers;
	
	@JsonProperty(value = "_total")
	private int total;
	
	@JsonProperty(value = "values")
	private List<ApiValues> apiValues;

	
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
