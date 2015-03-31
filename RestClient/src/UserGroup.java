import org.codehaus.jackson.annotate.JsonProperty;


public class UserGroup {

	@JsonProperty(value = "category")
	private Category category;

	@JsonProperty(value = "description")
	private String description;

	@JsonProperty(value = "id")
	private int id;

	@JsonProperty(value = "name")
	private String name;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserGroup [category=" + category + ", description="
				+ description + ", id=" + id + ", name=" + name + "]";
	}



}
