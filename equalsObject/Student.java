package equalsObject;

public class Student {
	String stname;
	int stscore;
	Student(String stname,int stscore){
		this.stname=stname;
		this.stscore=stscore;
	}
	public boolean equals(Object obj){
		Student e3=(Student)obj;
		return stscore>e3.stscore;
	}
	public static void main(String[] args) {
		Student e1=new Student("Rajesh",100);
		Student e2=new Student("Shruthi",101);
		if (e1.equals(e2)){
			System.out.println("Rajesh scored more");
		}else{
			System.out.println("Shruthi scored more");
			
		}
		
	}
	

}
