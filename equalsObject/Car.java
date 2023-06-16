package equalsObject;

public class Car {
	String c_colour;
	String c_brand;
	int c_price;
	Car(String c_colour,String c_brand,int c_price){
		this.c_colour=c_colour;
		this.c_brand=c_brand;
		this.c_price=c_price;
	}
	public boolean equals(Object obj){
		Car c3=(Car)obj;
		return c_price>c3.c_price;
	}
	public static void main(String[] args) {
		Car c1=new Car("Black","RR",50000000);
		Car c2=new Car("White","Maruthi_800",50000);
		if(c1.equals(c2)){
			System.out.println("RR price more");
		} else {
			System.out.println("Maruthi_800 price more");
		}
	}

}
