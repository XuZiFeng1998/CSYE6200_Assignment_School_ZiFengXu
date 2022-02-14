package xzf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
	
	private List<Student> studentRoster;
	private List<Person> personRoster;
	
	public School() {
		super();
		this.studentRoster = new ArrayList<>();
		this.personRoster = new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		this.studentRoster.add(student);
	}
	
	public void addPerson(Person person) {
		this.personRoster.add(person);
	}
	
	public void sortStudent(Comparator<Student> comparator) {
		studentRoster.sort(comparator);
	}
	
	public void sortPerson(Comparator<Person> comparator) {
		personRoster.sort(comparator);
	}

	@Override
	public String toString() {
		return "School [studentRoster=" + studentRoster + ", personRoster=" + personRoster + "]";
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student(10,"jack","smith",1,3.5);
		Student stu2 = new Student(12,"lucy","Li",2,3.7);
		Student stu3 = new Student(13,"jones","anna",3,3.6);
		Student stu4 = new Student(9,"lily","Joe",5,3.3);
		Student stu5 = new Student(14,"Frank","Han",4,3.9);
		
		School school = new School();
		school.studentRoster.add(stu1);
		school.studentRoster.add(stu2);
		school.studentRoster.add(stu3);
		school.studentRoster.add(stu4);
		school.studentRoster.add(stu5);
		
		school.personRoster.add(stu1);
		school.personRoster.add(stu2);
		school.personRoster.add(stu3);
		school.personRoster.add(stu4);
		school.personRoster.add(stu5);
		
		//sort by id and print
		school.studentRoster.sort(((o1,o2)->o1.getId()-(o2.getId())));
		//the person class can not sort by id as it does not contain this property
		//school.personRoster.sort(((o1,o2)->o1.getId()-(o2.getId())));
		System.out.println(school.studentRoster);
		
		//sort by age and print
		school.studentRoster.sort(((o1,o2)->o1.getAge()-(o2.getAge())));
		school.personRoster.sort(((o1,o2)->o1.getAge()-(o2.getAge())));
		System.out.println(school.studentRoster);
		System.out.println(school.personRoster);
		
		//sort by LastName and print
		school.studentRoster.sort(((o1,o2)->o1.getLastName().compareTo(o2.getLastName())));
		school.personRoster.sort(((o1,o2)->o1.getLastName().compareTo(o2.getLastName())));
		System.out.println(school.studentRoster);
		System.out.println(school.personRoster);
		
		//sort by gpa
		school.studentRoster.sort(((o1,o2)->o1.getGpa().compareTo(o2.getGpa())));
		//the person class can not sort by gpa as it does not contain this property
		System.out.println(school.studentRoster);
		
		
	}
	
	
	
}
