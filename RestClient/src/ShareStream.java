
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class ShareStream {
	
	@JsonProperty(value = "networkStats")	
	private NetworkStats networkStats;

	@JsonProperty(value = "updates")	
	private CompaniesGroup updates;
	
	
	public CompaniesGroup getUpdates() {
		return updates;
	}

	public void setUpdates(CompaniesGroup updates) {
		this.updates = updates;
	}

	public NetworkStats getNetworkStats() {
		return networkStats;
	}

	public void setNetworkStats(NetworkStats networkStats) {
		this.networkStats = networkStats;
	}

	@Override
	public String toString() {
		return "ShareStream [networkStats=" + networkStats + ", updates="
				+ updates + "]";
	}
}
