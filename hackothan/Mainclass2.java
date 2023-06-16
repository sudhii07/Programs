package hackothan;

public class Mainclass2 {
	public static void main(String[] args) {
		int count=0;
		int arr []={1,2,9};
		for(int i=0;i<arr.length;i++){
			if(arr[i]==9){
				count++;
			}
		}
		System.out.println("The count of the nunber is"+count);
	}

}
