package Iterface_programs;
interface  Demo{
	void test();
	void disp();
}
class Sample implements Demo{
	public void test(){
		System.out.println("Hello");
	}
	public void disp(){
		System.out.println("Hi");
	}
}
public class Mainclass1 {
	public static void main(String [] args){
Sample s1=new Sample();
s1.test();
s1.disp();
}
}
