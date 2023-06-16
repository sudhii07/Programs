package Encapsulation;

class Master {
	private int b = 2005125;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

public class Googlepay {

	public static void main(String[] args) {
		Master m1 = new Master();
		System.out.println(m1.getB());
		m1.setB(1520015);
		System.out.println(m1.getB());
	}
}
