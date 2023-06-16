package Iterface_programs;
interface Nike{
	void shoes();
}
interface Puma extends Nike{
	void bags();
}
class Rajoutlet implements Puma{
	public void shoes(){
		System.out.println("Jingilala shoes");
	}
	public void bags(){
		System.out.println("Jingilala bags");
	}
}
public class Mainclass3 {
	public static void main(String [] args){
		Rajoutlet r1 = new Rajoutlet();
		r1.bags();
		r1.shoes();
	}

}
