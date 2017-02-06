package example;

public class Dog {
	// Fields:
	private String name;
	// Constructors:
	public Dog() {
		this.name = "unknown";
	}

	public Dog(String name) {
		this.name = name;
	}
	// Setters:
	public void setName(String name) {
		this.name = name;
	}
	// Getters:
	public String getName() {
		return this.name;
	}
}
