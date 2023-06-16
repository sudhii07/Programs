package DSPrograms;

 class Demo{
	int [] arr=null;
	public Demo(int size){
		arr=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.MIN_VALUE;
		}
	}
	public void insert(int loc,int value){
		try{
			if(arr[loc]==Integer.MIN_VALUE){
				arr[loc]=value;
				System.out.println("value is inserted");
			} else {
				System.out.println("The cell is already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Insufficient space");
		}
	}
	public void search(int index){
		System.out.println(arr[index]);
	}
	
	public void index(int value){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				System.out.println("the index is "+i);
			}
		}
	}
	
	public void delete(int index){
		arr[index]=Integer.MIN_VALUE;
		System.out.println("The value is deleted");
	}
	 
}
public class Sample {
	public static void main(String[] args) {
		Demo d=new Demo(10);
	    d.insert(0, 1);
		d.insert(4,1);
		d.insert(9, 2);
		d.insert(11, 4);
		d.insert(2, 10);
		d.search(2);
		d.index(10);
		d.delete(2);
		d.search(2);
	}
}


