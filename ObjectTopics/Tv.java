package ObjectTopics;

public class Tv {
	int cost;
	String brand;
	String type;
	Tv(int cost,String brand,String type){
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
	public String toString(){
		return "The tv cost is:"+cost+"\n"+"The tv brand is:"+brand+"\n"+"The tv type is:"+type;
	}
	public static void main(String[] args) {
		Tv t=new Tv(36000,"Sony","LED");
		System.out.println(t);
	}

}
