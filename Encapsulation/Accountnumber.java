package Encapsulation;

class Sample22222 {
	private int pin = 50;

	public int getpin() {
		return pin;
	}

	public void setpin(int pin) {
		this.pin = pin;
	}
}

public class Accountnumber {
	public static void main(String[] args) {
		Sample22222 s1 = new Sample22222();
		System.out.println(s1.getpin());
		s1.setpin(145612);
		System.out.println(s1.getpin());

	}
}
