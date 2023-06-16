package equalsObject;

public class Pizza {
	String pname;
	int price;
	int qty;
	String loc;
	Pizza(String pname,int price,int qty,String loc){
		this.pname=pname;
		this.price=price;
		this.qty=qty;
		this.loc=loc;
	}
	public boolean equals(Object obj){
		Pizza p3=(Pizza)obj;
		return qty>p3.qty;
	}
	public static void main(String[] args) {
		Pizza p1=new Pizza("without chees",200,50,"RajajiNagar");
		Pizza p2=new Pizza("with chees",500,10,"VijayNagar");
		if(p1.equals(p2)){
			System.out.println("without chees qty is more");
		} else {
			System.out.println("with chees qty is more");
		}
	}

}
