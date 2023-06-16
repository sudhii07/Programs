package Collection;

import java.util.LinkedHashSet;

public class For_Each_Loop {
	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add(10);
		l.add(20.56);
		l.add("hi");
		l.add('A');
		l.add(10);
		for(Object a:l){
			System.out.println(a);
		}
	}
}
