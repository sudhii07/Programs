package ObjectTopics;

public class Laptop {
	String name;
	int cost;
	String brand;

	Laptop(String name, int cost, String brand) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	public String toString() {
		return "The laptop name is:" + name + "\n" + "The laptop cost is" + cost + "\n" + "The laptop brand is:"
				+ brand;
	}

	public static void main(String[] args) {
		Laptop l = new Laptop("HP", 50000, "Hp-15");
		System.out.println(l);
	}

}
