package ObjectTopics;

public class Course {
	String name;
	String Uname;
	int cost;
	Course(String name,String Uname,int cost){
		this.name=name;
		this.Uname=Uname;
		this.cost=cost;
	}
	public String toString(){
		return "The course name is:"+name+"\n"+"The University name is:"+Uname+"\n"+"The exam fees is:"+cost;
	}
	public static void main(String[] args) {
		Course c=new Course("BCA","RCUB",1500);
		System.out.println(c);
	}

}
