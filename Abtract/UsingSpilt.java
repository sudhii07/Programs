package Abtract;
class UsingSpilt {
public static void main(String[] args){
	String str="hoga beda hudugi nan bittu";
	String str1 [] = str.split(""); 
	for(int i=str1.length-1;i>=0;i--){
		System.out.print(str1[i]);
	}
}
}
