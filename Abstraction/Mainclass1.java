package Abstraction;
interface Trip{
 public  void travel();
}
class Goa implements Trip{
	public void travel(){
		System.out.println("Goaaa is a best");
	}
}
class London implements Trip{
	public void travel(){
		System.out.println("Londonnnn");
	}
}
class Paris implements Trip{
	public void travel(){
		System.out.println("Parisss");
	}
}
class Money{
	public static void budget(Trip t1){
		t1.travel();
	}
}
public class Mainclass1 {
	public static void main(String [] args){
		Goa g=new Goa();
		London l=new London();
		Paris p=new Paris();
		Money.budget(g);
		Money.budget(l);
		Money.budget(p);
	}
}
