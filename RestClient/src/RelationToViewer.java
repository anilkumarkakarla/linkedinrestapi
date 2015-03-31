import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RelationToViewer {

	@JsonProperty(value = "id")
	private AvailableAction availableActions;

	public AvailableAction getAvailableActions() {
		return availableActions;
	}

	public void setAvailableActions(AvailableAction availableActions) {
		this.availableActions = availableActions;
	}

	@Override
	public String toString() {
		return "RelationToViewer [availableActions=" + availableActions + "]";
	}


}
