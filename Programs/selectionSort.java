package Programs;

public class selectionSort {
	public static void main(String[] args) {
		int [] arr={6,5,7,2};
		for(int i=0;i<4;i++){
			int min=i;
			for(int j=i+1;j<4;j++){
				if(arr[i]< arr[min] ){
					min=j;
					int temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
				}
				
			}
			
		}
		
	}
}
