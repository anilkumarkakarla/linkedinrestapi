
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({"id","firstName", "lastName", "url"})
@JsonIgnoreProperties(ignoreUnknown=true)
public class Output {
	@JsonProperty(value = "companies")
	private CompaniesGroup companies;
	
	@JsonProperty(value = "facets")
	private Facets facets;
	
	@JsonProperty(value = "numResults")
	private int  numResults;
	
	@JsonProperty(value = "jobs")
	private List<SuggestedCompany>suggestedCompany;

	

	public List<SuggestedCompany> getSuggestedCompany() {
		return suggestedCompany;
	}

	public void setSuggestedCompany(List<SuggestedCompany> suggestedCompany) {
		this.suggestedCompany = suggestedCompany;
	}

	public int getNumResults() {
		return numResults;
	}

	public void setNumResults(int numResults) {
		this.numResults = numResults;
	}

	public Facets getFacets() {
		return facets;
	}

	public void setFacets(Facets facets) {
		this.facets = facets;
	}

	

	public CompaniesGroup getCompanies() {
		return companies;
	}

	public void setCompanies(CompaniesGroup companies) {
		this.companies = companies;
	}

	@Override
	public String toString() {
		return "Output [companies=" + companies + ", facets=" + facets
				+ ", numResults=" + numResults + ", suggestedCompany="
				+ suggestedCompany + "]";
	}

	
}
