// Fig. 3.31: Account.java account class that contains a name instance variable and methods to set and get its value

public class Account {
	private String name; // instance variable

	// method to set the name in the object
	public void setName(String name) {
		this.name = name; // store the name
	}

	// method to retrieve the name from the object
	public String getname(){
		return name;
	}
}