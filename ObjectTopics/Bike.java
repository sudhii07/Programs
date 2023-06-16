package ObjectTopics;

public class Bike {
	int cost;
	String brand;
	String colour;
	Bike(int cost,String brand,String colour){
		this.cost=cost;
		this.brand=brand;
		this.colour=colour;
	}

	public String toString(){
		return "The bike cost is:"+cost+"\n"+"The bike brand is:"+brand+"\n"+"The bike colour is:"+colour;
	}
	public static void main(String[] args) {
		Bike b=new Bike(200000,"Kawasaki","Black");
		System.out.println(b);
	}

}
