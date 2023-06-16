package Abtract;
abstract class Demo1{
	abstract void cool();
	abstract void test();
}
abstract class Sample1 extends Demo1{
	void test(){
		System.out.println("hello");
	}
}
public class Tester1 extends Sample1 {
	void cool(){
		System.out.println("hi");
	}
	public static void main(String [] args){
		Tester1 t1=new Tester1();
		t1.test();
		t1.cool();
	}

}
