package ObjectTopics;

public class Home {
	String name;
	int cost;
	String colour;

	Home(String name, int cost, String colour) {
		this.name = name;
		this.cost = cost;
		this.colour = colour;
	}

	public String toString() {
		return "The home name is:" + name + "\n" + "The home cost is:" + cost + "\n" + "The home colour is:" + colour;
	}

	public static void main(String[] args) {
		Home h = new Home("HappyFamily", 15000, "Yellow");
		System.out.println(h);
	}

}
