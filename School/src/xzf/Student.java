package xzf;

public class Student extends Person{
	
	

	private int id;
	private Double gpa;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	
	public Student(int age,String firstName,String lastName,int id, double gpa) {
		super(age,firstName,lastName);
		this.id = id;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", gpa=" + gpa + ", getAge()=" + getAge() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + "]";
	}
	
	
	
	
	

}
