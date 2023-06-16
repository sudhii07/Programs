package Encapsulation;

class Sample111 {
	private int a = 200515;

	public int geta() {
		return a;
	}

	public void seta(int a) {
		this.a = a;
	}
}

public class Sample {
	public static void main(String[] args) {
		Sample111 s1 = new Sample111();
		System.out.println(s1.geta());

		s1.seta(152005);
		System.out.println(s1.geta());
	}

}
