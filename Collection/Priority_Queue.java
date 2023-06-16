package Collection;

import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(5);
		p.add(1);
		p.add(4);
		System.out.println(p);
		System.out.println(p.poll());//it will remove the first element.
		System.out.println(p);
		System.out.println(p.peek());//it will fetch the first element.
		System.out.println(p);
	}
}
