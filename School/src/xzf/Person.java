package xzf;

public class Person {
	private int age;
	private String firstName;
	private String LastName;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	
	public Person() {
		
	}
	public Person(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		LastName = lastName;
	}
	
	
	

}
