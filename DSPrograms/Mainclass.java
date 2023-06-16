package DSPrograms;

public class Mainclass {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 9, 4, 7 };
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			char ch=(char) (arr[i]+64);
			System.out.print(ch+" ");
		}
	}

}
