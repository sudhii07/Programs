package ObjectTopics;

public class Car {
	int cost;
	String Mname;
	String type;

	Car(int cost, String Mname, String type) {
		this.cost = cost;
		this.Mname = Mname;
		this.type = type;
	}

	public String toString() {
		return "The car cost is:" + cost + "\n" + "The car model name is:" + Mname + "\n" + "The car type name is:"
				+ type;
	}

	public static void main(String[] args) {
		Car c = new Car(500000, "RR", "Petrol");
		System.out.println(c);
	}

}
