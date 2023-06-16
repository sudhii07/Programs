package Polymorphism;
class Playground{
public void play(){
	System.out.println("playing");
}
}
class Cricket extends Playground{
	public void play(){
		System.out.println("Cricket is love");
	}
}
class Football extends Playground{
	public void play(){
		System.out.println("Football is heart");
	}
}
class Baseball extends Playground{
	public void play(){
		System.out.println("Baseball is nothing");
	}
}
class Children{
	 static void games(Playground p){
		p.play();
	}
}
public class Mainclass4 {
public static void main(String[] args) {
	Cricket c=new Cricket();
	Football f=new Football();
	Baseball b=new Baseball();
	Children.games(c);
	Children.games(f);
	Children.games(b);
}
}
