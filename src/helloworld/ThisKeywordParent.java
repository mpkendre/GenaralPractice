package helloworld;

public class ThisKeywordParent extends FinalKeywordChild//Consider Child 
{

private String name;
private String surname;

public String getName() {
	return name;
}
public void setName(String name) { 
super.setName("");
	this.name = name;
	System.out.println("Parent class name:"+super.getName());
	System.out.println("Parent class name:"+name);
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}
	
}
