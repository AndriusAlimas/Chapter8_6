package example;

import java.io.Serializable;

import example.Dog;

public abstract class PersonBean implements Serializable {
	// Fields:
	private String firstName;
	private String lastName;
	private Dog dog;
	// Constructors:
	public PersonBean() {
	}

	public PersonBean(String firstName, String lastName, Dog dog) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dog = dog;
	}
	// Setters:
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	// Getters:
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Dog getDog() {
		return this.dog;
	}
}
