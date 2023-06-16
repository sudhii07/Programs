package TestCases;

public class AddCharAtfrontBack {

	public static void main(String[] args) {
		String s1="dtdgfdtt";
		String s2="";
		if(s1.length()>=3){
		        s2=(s1.substring(0,2));
				String s3=s2+"-"+s1+"-"+s2;
				System.out.println(s3);
		} else {
			s2=s1.substring(0);
			System.out.println(s2+"-"+s1+"-"+s2);
		}
	   
	}

}
