
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class CompaniesGroup {
	@JsonProperty(value = "_count")
	private int count;
	
	@JsonProperty(value = "_start")
	private int start;
	
	
	@JsonProperty(value = "_total")
	private int total;	
	
	
	@JsonProperty(value = "values")
	private List<CompanyValues> companyValues;
	
	
	@JsonProperty(value = "updateContent")
	private UpdateContent updateContent;

	@JsonProperty(value = "updateComments")
	private CompanyUpdatesComments companyUpdateComments;
	
	

	public List<CompanyValues> getCompanyValues() {
		return companyValues;
	}

	public void setCompanyValues(List<CompanyValues> companyValues) {
		this.companyValues = companyValues;
	}

	public UpdateContent getUpdateContent() {
		return updateContent;
	}

	public void setUpdateContent(UpdateContent updateContent) {
		this.updateContent = updateContent;
	}

	public CompanyUpdatesComments getCompanyUpdateComments() {
		return companyUpdateComments;
	}

	public void setCompanyUpdateComments(
			CompanyUpdatesComments companyUpdateComments) {
		this.companyUpdateComments = companyUpdateComments;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public List<CompanyValues> getCompanyUpdatesComments() {
		return companyValues;
	}

	public void setCompanyUpdatesComments(
			List<CompanyValues> companyValues) {
		this.companyValues = companyValues;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	//@JsonProperty(value = "values")
	private List<Company> companies;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CompaniesGroup [count=" + count + ", start=" + start
				+ ", total=" + total + ", companyValues=" + companyValues
				+ ", companyUpdateComments=" + companyUpdateComments
				+ ", updateContent=" + updateContent + ", companies=" + companies + "]";
	}

	

	

}
