package Abstraction;
interface Hall{
	public void fuction();
	}
class Birthday implements Hall{
	public void fuction(){
		System.out.println("Happy Birthday");
	}
}
class Marriage implements Hall{
	public void fuction(){
		System.out.println("Happy Married life");
	}
}
class Engagment implements Hall{
	public void fuction(){
		System.out.println("Happy Engagment");
	}
}
class Celebration{
	static void family(Hall h){
		h.fuction();
	}
}
public class Mainclass5 {
public static void main(String[] args) {
	Birthday b=new Birthday();
	Marriage m=new Marriage();
	Engagment e=new Engagment();
	Celebration.family(b);
	Celebration.family(m);
	Celebration.family(e);
}
}
