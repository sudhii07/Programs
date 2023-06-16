package Programs;

public class FactOfRec {
	int fact = 0;

	static int fact(int no) {
		if (no == 1) {
			return 1;
		} else {
			return no * fact(no - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
