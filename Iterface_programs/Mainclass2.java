package Iterface_programs;
interface Demo1{
	void disp();
	void cool();
}
abstract class Tester1 implements Demo1{
	public void disp(){
		System.out.println("Hello");
	}
}
class Sample1 extends Tester1{
	public void cool(){
		System.out.println("Hey your cool");
	}
}
public class Mainclass2 {
	public static void main(String [] args){
	Sample1 s1=new Sample1();
	s1.disp();
	s1.cool();
	}
}
