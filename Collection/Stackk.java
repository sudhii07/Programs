package Collection;

import java.util.Stack;
public class Stackk {

	public static void main(String[] args) {
		 Stack animals= new Stack();
		// Add elements to Stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		animals.push(1);
		System.out.println("Stack: " + animals);

		// Access element from the top
		System.out.println("Element at top : "+animals.peek());
		System.out.println("Position of Dog : "+animals.search("Dog"));
		System.out.println("Element the removed : "+animals.pop());
		System.out.println("The stack is empty? : "+animals.empty());
		System.out.println("Stack : "+animals);
	}
}
