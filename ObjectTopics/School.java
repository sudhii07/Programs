package ObjectTopics;
public class School {
	String sname;
	int strength;
	char grade;
	School (String sname,int strength,char grade){
		this.sname=sname;
		this.strength=strength;
		this.grade=grade;
	}
	public String toString(){
		return "The school name is:"+sname+"\n"+"The school strength is:"+strength+"\n"+"The school grade is:"+grade;
	}
	public static void main(String[] args) {
		School s=new School("Jspiders",5000,'A');
		System.out.println(s);
	}
}
