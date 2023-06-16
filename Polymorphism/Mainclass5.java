package Polymorphism;
class Hall{
	public void function(){
		System.out.println("functioning");
	}
	}
class Birthday extends Hall{
	public void function(){
		System.out.println("Happy Birthday");
	}
}
class Marriage extends Hall{
	public void function(){
		System.out.println("Happy Married life");
	}
}
class Engagment extends Hall{
	public void function(){
		System.out.println("Happy Engagment");
	}
}
class Celebration{
	static void family(Hall h){
		h.function();
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
