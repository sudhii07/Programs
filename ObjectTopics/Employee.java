package ObjectTopics;

public class Employee {
	int id;
	int sal;
	char grade;

	Employee(int id, int sal, char grade) {
		this.id = id;
		this.sal = sal;
		this.grade = grade;
	}

	public String toString() {
		return "The employee id is:" + id + "\n" + "The sal of employee is" + sal + "\n" + "The employee grade is:"
				+ grade;
	}

	public static void main(String[] args) {
		Employee e = new Employee(201, 25000, 'A');
		System.out.println(e);
	}

}
