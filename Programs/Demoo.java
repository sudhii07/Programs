package Programs;
interface Tester{
  void disp();
}
 interface Cool{
	 int x=10;
 }
public class Demoo implements Tester,Cool{
	public void disp(){
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Demoo d=new Demoo();
			System.out.println(d.x);
			d.disp();
		}
	}


