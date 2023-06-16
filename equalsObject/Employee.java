package equalsObject;

public class Employee {
	String emp_name;
	int emp_sal;
	String emp_dept;
	String emp_cpn;
	Employee(String emp_name,int emp_sal,String emp_dept,String emp_cpn){
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
	}
	public boolean equals(Object obj){
		Employee e3=(Employee)obj;
		return emp_sal==e3.emp_sal;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Rajesh",50000,"Manager","TCS");
		Employee e2=new Employee("Shruthi",50000,"Manager","TCS");
		System.out.println(e1.equals(e2));
	}

}











