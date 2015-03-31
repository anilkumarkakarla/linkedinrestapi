import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Comments {
  
 private String _key;
  
  @JsonProperty(value = "creator")
  private Person creator;
  
  @JsonProperty(value = "id")
  private String id;
  
  @JsonProperty(value = "text")
  private String text;

public String get_key() {
	return _key;
}

public void set_key(String _key) {
	this._key = _key;
}

public Person getCreator() {
	return creator;
}

public void setCreator(Person creator) {
	this.creator = creator;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

@Override
public String toString() {
	return "PostComment [_key=" + _key + ", creator=" + creator + ", id=" + id
			+ ", text=" + text + "]";
}
  
  
  
  
}
