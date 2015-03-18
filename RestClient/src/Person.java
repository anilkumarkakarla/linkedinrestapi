


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({"id","firstName", "lastName", "url"})
@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {
	
@JsonProperty(value = "firstName")
private String firstName;


@JsonProperty(value = "headline")
 private String headline;



@JsonProperty(value = "id")	
private String id;

 
@JsonProperty(value = "lastName")	
private String lastName;

@JsonProperty(value = "url")
 private String url;



@JsonProperty(value = "industry")
private String industry;


@JsonProperty(value = "name")
private String name;



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getHeadline() {
	return headline;
}

public void setHeadline(String headline) {
	this.headline = headline;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "Person [firstName=" + firstName + ", headline=" + headline
			+ ", id=" + id + ", lastName=" + lastName + ", url=" + url
			+ ", industry=" + industry + ", name=" + name + "]";
}


}