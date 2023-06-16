package equalsObject;

public class Cold_Drinks {
	String cd_name;
	int cd_price;
	int cd_qty;
	String brand;
	Cold_Drinks(String cd_name,int cd_price,int cd_qty,String brand){
		this.cd_name=cd_name;
		this.cd_price=cd_price;
		this.cd_qty=cd_qty;
		this.brand=brand;
	}
	public boolean equals(Object obj){
		Cold_Drinks d3=(Cold_Drinks) obj;
		return this.cd_price>d3.cd_price;
	}
	public static void main(String[] args) {
		Cold_Drinks c1=new Cold_Drinks("Pepsi",55,2,"Pepsiii");
		Cold_Drinks c2=new Cold_Drinks("Coco-cola",53,2,"colaaaaaa");
		if(c1.equals(c2)){
			System.out.println("Pepsi price is more");
		} else {
			System.out.println("Cola price is more");
		}
	}

}
