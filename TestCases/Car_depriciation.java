package TestCases;

public class Car_depriciation {
	public static void main(String[] args) {
		long amt,dep,year,temp;
		amt=5000;
		dep=5;
		year=5;
		temp=amt;
		for(int i=0;i<year;i++){
			temp=((100-dep)*temp)/100;
			System.out.println(temp);
		}
	}
}
