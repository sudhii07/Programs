package Programs;

import java.util.Scanner;

public class Sample1 {
	Scanner sc=new Scanner(System.in);
	String uname;
	int pass;
	long pno;
	int withdrow;
	int balance;
	void signup(){
		System.out.println("Enter user name");
		String uname=sc.nextLine();
		this.uname=uname;
		System.out.println("Enter the password");
		int pass=sc.nextInt();
		this.pass=pass;
		System.out.println("Enter the phone number");
		long pno=sc.nextLong();
		this.pno=pno;
		System.out.println("SingUp completed");
	}
	
	void login(){
		System.out.println("Enter user name");
		String uname1=sc.nextLine();
		System.out.println("Enter the password");
		int pass1=sc.nextInt();
		if(uname1==uname && pass1==pass){
			System.out.println("Login successful");
		}
		
	}
	void checkbalance(){
		int balance=10000;
		this.balance=balance;
		this.withdrow=withdrow;
		System.out.println("The balance is"+ balance);
		
	}
	
	void withdrow(){
		System.out.println("Enter the amount");
		int withdrow=sc.nextInt();
		balance=balance-withdrow;
		System.out.println("Your transaction is completed");
	}
	
	void logout(){
		System.out.println("Logout completed");
	}
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		Scanner scc=new Scanner(System.in);
		System.out.println("Select what you want....");
		System.out.println("Select 1 for signUp");
		System.out.println("Select 2 for login");
		System.out.println("Select 3 for checkbalance");
		System.out.println("Select 4 for withdrow");
		System.out.println("Select 5 for logout");
		int result=scc.nextInt();
		switch(result){
		case 1: s.signup();
		        break;
		case 2: s.login();
		        break;
		case 3: s.checkbalance();
				break;
		case 4: s.withdrow();
				break;
		case 5:s.logout();
				break;
		}
		
	}

}
