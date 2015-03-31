import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Api {
	
	@JsonProperty(value = "apiStandardProfileRequest")
	private List<ApiStandardProfileRequest> apiStandardProfileRequest;

	public List<ApiStandardProfileRequest> getApiStandardProfileRequest() {
		return apiStandardProfileRequest;
	}

	public void setApiStandardProfileRequest(
			List<ApiStandardProfileRequest> apiStandardProfileRequest) {
		this.apiStandardProfileRequest = apiStandardProfileRequest;
	}

	@Override
	public String toString() {
		return "Api [apiStandardProfileRequest=" + apiStandardProfileRequest
				+ "]";
	}
	
	

}
