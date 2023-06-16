package Encapsulation;

class Sample005 {
	private int pin = 0000;

	public int getpin() {
		return pin;
	}

	public void setpin(int pin) {
		this.pin = pin;
	}

}

public class Googlepin {
	public static void main(String[] args) {
		Sample005 s1 = new Sample005();
		System.out.println(s1.getpin());

		s1.setpin(123456);
		System.out.println(s1.getpin());
	}

}
