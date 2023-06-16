package Programs;

public class Demo {

	Demo(String name){
		System.out.println("the name is "+name);
	}
	Demo(int no){
		this("sudhan");
		System.out.println("the no is "+no);
	}
	
	public static void main(String[] args) {
		Demo d=new Demo(3);
	}

}
