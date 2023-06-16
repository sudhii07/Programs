package ObjectTopics;

public class Mobile {
	int cost;
	String Mname;
	String colour;

	Mobile(int cost, String Mname, String colour) {
		this.cost = cost;
		this.Mname = Mname;
		this.colour = colour;
	}

	public String toString() {
		return "The phone cost is:" + cost + "\n" + "The phone name is:" + Mname + "\n" + "The phone colour is:"
				+ colour;
	}

	public static void main(String[] args) {
		Mobile m = new Mobile(50000, "Realme", "Grey");
		System.out.println(m);
	}

}
