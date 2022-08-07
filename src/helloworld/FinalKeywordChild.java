package helloworld;

public class FinalKeywordChild //Consider Parent
{
private String name;
private String surname;

public String getName() {
	return name;
}
public void setName(String name) { 
	System.out.println("Setting Name: "+name);
	this.name = "name";
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}
	
}
