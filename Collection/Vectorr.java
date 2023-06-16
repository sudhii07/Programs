package Collection;

import java.util.Vector;

public class Vectorr {
public static void main(String[] args) {
	Vector v=new Vector(3);
	System.out.println("Before capacity-->"+v.capacity());
	v.add(10);
	v.add(20.23);
	v.add(null);
	v.add(10);
	System.out.println(v);
	System.out.println("The size is-->"+v.size());
	System.out.println("After capacity-->"+v.capacity());
	
	//It increases its capacity by double of size whenever u add value more then size. 
}
}
