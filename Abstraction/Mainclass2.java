package Abstraction;
interface Bus{
	public void travel();
}
class Ksrtc implements Bus{
	public void travel(){
		System.out.println("KSRTC bus bus");
	}
}
class Bmtc implements Bus{
	public void travel(){
		System.out.println("BMTC bus bus");
	}
}
class Private implements Bus{
	public void travel(){
		System.out.println("PRIVATE bus bus");
	}
}
class Transform {
	public static void with(Bus b1){
		b1.travel();	
	}
}
public class Mainclass2 {
public static void main(String[] args) {
	Ksrtc k=new Ksrtc();
	Bmtc b=new Bmtc();
	Private p=new Private();
	Transform.with(k);
	Transform.with(b);
	Transform.with(p);
}  
	
}
