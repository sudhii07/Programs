package equalsObject;

public class School {
	String sname;
	int strength;
	char grade;
	String type;
	School(String sname,int strength,char grade,String type){
		this.sname=sname;
		this.strength=strength;
		this.grade=grade;
		this.type=type;
	}
	public boolean equals(Object obj){
		School s3=(School) obj;
		return strength>s3.strength;
	}
	public static void main(String[] args) {
		School s1=new School("Jspiders",9000,'A',"Developer");
		School s2=new School("Qspiders",6000,'A',"Testing");
		if(s1.equals(s2)){
			System.out.println("Jspiders have more strength");
		} else {
			System.out.println("Qspiders have more strength");
		}
	}

}
