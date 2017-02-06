package example;

public class Dog {
	// Fields:
	private String dName;
	// Constructors:
	public Dog() {
		this.dName = "unknown";
	}

	public Dog(String dName) {
		this.dName = dName;
	}
	// Setters:
	public void setDname(String dName) {
		this.dName = dName;
	}
	// Getters:
	public String getDname() {
		return this.dName;
	}
}
