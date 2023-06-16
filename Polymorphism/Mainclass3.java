package Polymorphism;
class Flipkart{
	public void order(){
		System.out.println("Ordering");
	}
}
class Bags extends Flipkart{
	public void order(){
		System.out.println("Jingilaka bags");
	}
}
class Cloths extends Flipkart{
	public void order(){
		System.out.println("Jingilaka cloths");
	}
}
class Shoes extends Flipkart{
	public void order(){
		System.out.println("Jingilaka shoes");
	}
}
class Customer{
   static void buy(Flipkart f){
	   f.order();
   }
}
public class Mainclass3 {
public static void main(String[] args) {
	Bags b=new Bags();
	Cloths c=new Cloths();
	Shoes s=new Shoes();
	Customer.buy(b);
	Customer.buy(c);
	Customer.buy(s);
}
}
