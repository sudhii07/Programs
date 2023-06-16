package DSPrograms;
public class Sample11 {
	public static void main(String[] args) {
		int add=0;
		int arr[]={1,4,16,7,8,2,6};
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			add=add+arr[i]+arr[i];
			arr2[i]=add;
			add=0;
		}
//		for(int i=0;i<arr2.length;i++){
//			if(arr2[i]%2==0){
//				System.out.println("divisible");
//			}
//		}
		for(int j=arr2.length/2+1;j<arr2.length;j++){
			System.out.println(arr2[j]);
		}
		
	}
}
