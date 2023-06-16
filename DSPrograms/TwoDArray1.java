package DSPrograms;

public class TwoDArray1 {
	public static void main(String[] args) {
		array a=new array(2,2);
		a.insert(0, 0, 2);
		a.insert(0, 1, 4);
		a.insert(1, 0, 6);
		a.insert(1, 1, 8);
		a.print();
		a.search(1, 0);
		a.findIndex(4);
		a.delete(1, 1);
		a.print();
		
	}
}
class array{
	int arr [][]=null;
	public array(int row,int col){
		arr=new int[row][col];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.MIN_VALUE;
			}
		}
	}
	public void insert(int row,int col,int value){
		try{
			if(arr[row][col]==Integer.MIN_VALUE){
				arr[row][col]=value;
				System.out.println("Inserted");
			} else {
				System.out.println("The cell already occupied the value");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Insufficient space");
		}
	}
	 void print(){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
	}
	 void search(int row,int col){
		 System.out.println(arr[row][col]);
	 }
	 void findIndex(int value){
		 for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					if(arr[i][j]==value){
						System.out.println("["+i+","+j+"]");
					}
				}
			}
	 }
	 void delete(int row,int col){
		 arr[row][col]=Integer.MIN_VALUE;
		 System.out.println("Deleted");
	 }
}

