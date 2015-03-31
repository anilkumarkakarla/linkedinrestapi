import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupSetting {

	@JsonProperty(value = "key")
	private int key;

	@JsonProperty(value = "group")
	private Group group;

	@JsonProperty(value = "membershipState")
	private Country membershipState;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Country getMembershipState() {
		return membershipState;
	}

	public void setMembershipState(Country membershipState) {
		this.membershipState = membershipState;
	}

	@Override
	public String toString() {
		return "GroupSetting [key=" + key + ", group=" + group
				+ ", membershipState=" + membershipState + "]";
	}




}
