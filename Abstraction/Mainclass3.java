package Abstraction;
interface Flipkart{
	public void order();
}
class Bags implements Flipkart{
	public void order(){
		System.out.println("Jingilaka bags");
	}
}
class Cloths implements Flipkart{
	public void order(){
		System.out.println("Jingilaka cloths");
	}
}
class Shoes implements Flipkart{
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
