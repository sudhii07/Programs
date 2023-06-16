package Polymorphism;

class Trip{
	 public  void travel(){
		 System.out.println("traveling places");
	 }
	}
	class Goa extends Trip{
		public void travel(){
			System.out.println("Goaaa is a best");
		}
	}
	class London extends Trip{
		public void travel(){
			System.out.println("Londonnnn");
		}
	}
	class Paris extends Trip{
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