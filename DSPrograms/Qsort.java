package DSPrograms;

public class Qsort {
	public static void main(String[] args) {
		int [] arr={3,4,6,2,8,7,9};
		qsort(arr,0,arr.length-1);
		printArray(arr);
	}
	
	static  int partition(int [] arr,int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	static void swap(int [] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void qsort(int [] arr,int low,int high){
		if(low<high){
			int pivot=partition(arr,low,high);
			qsort(arr,low,pivot-1);
			qsort(arr,pivot+1,high);
		}
	}
	static void printArray(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
