package Collection;

import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(30);
		l.add(20.23);
		l.add(null);
		l.add(10);
		System.out.println(l);
		System.out.println(l.get(1));//it will give u that indexed value
		System.out.println(l.peek());//it will fetch the first value present in the list
		System.out.println(l.poll());//it will remove the first value present in the list
		System.out.println(l);
		
		
	}
}
