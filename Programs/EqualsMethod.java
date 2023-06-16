package Programs;

public class EqualsMethod {	
	public static void main(String[] args) {
		EqualsMethod e1=new EqualsMethod();
		EqualsMethod e2=e1;
		EqualsMethod e4=new EqualsMethod();
		System.out.println(e2.equals(e1));
	}

}
