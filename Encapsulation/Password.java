package Encapsulation;

class Instagram {
	private String a = "Sweety";

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

}

public class Password {
	public static void main(String[] args) {
		Instagram i1 = new Instagram();

		System.out.println(i1.getA());
		i1.setA("spicy");
		System.out.println(i1.getA());

	}

}
