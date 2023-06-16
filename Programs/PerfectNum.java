package Programs;

public class PerfectNum {
	public static void main(String[] args) {
		int no = 28;
		int copy = no;
		int sum = 0;
		int i = 1;
		while (i <= no / 2) {
			if (no % i == 0) {
				sum += i;
			}
			i++;
		}
		if (copy == sum) {
			System.out.println("Its a perfect no");
		} else {
			System.out.println("Its not a perfect no");
		}
	}

}
