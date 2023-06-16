package Iterface_programs;


interface Animal{
	  public void noise();
	}
class Dog implements Animal{
	public void noise(){
		System.out.println("bow bow");
	}
}
class Cat implements Animal{
	public void noise(){
		System.out.println("meo meo");
	}
}
class Snake implements Animal{
	public void noise(){
		System.out.println("bus bus");
	}
}
class Stimulator{
	static void ansim(Animal a1){
		a1.noise();
		
	}
}
public class Abstraction {
	public static void main(String [] args){
		Cat c1=new Cat();
		Dog d1=new Dog();
		Snake s1=new Snake();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		Stimulator.ansim(s1);
	}
	
	

}
