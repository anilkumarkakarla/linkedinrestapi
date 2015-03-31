import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyVacancy {
	
	@JsonProperty(value = "jobs")
	private SuggestedCompany suggestedCompany;

	public SuggestedCompany getSuggestedCompany() {
		return suggestedCompany;
	}

	public void setSuggestedCompany(SuggestedCompany suggestedCompany) {
		this.suggestedCompany = suggestedCompany;
	}

	@Override
	public String toString() {
		return "CompanyVacancy [suggestedCompany=" + suggestedCompany + "]";
	}


}
