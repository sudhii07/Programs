package ObjectTopics;

public class Cloth {
	String colour;
	int cost;
	String size;
	Cloth(String colour,int cost,String size){
		this.colour=colour;
		this.cost=cost;
		this.size=size;
	}
	public String toString(){
		return "The colour is:"+colour+"\n"+"The cost is:"+cost+"\n"+"The size is:"+size;
	}
	public static void main(String[] args) {
		Cloth c=new Cloth("Black",5000,"XL");
		System.out.println(c);
	}

}
