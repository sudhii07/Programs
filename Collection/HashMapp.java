package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapp {
	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<>();
		h.put("Rocky", 225);
		h.put("Dingi", 5);
		h.put("Dingi", 2);
		h.put("Sri", 225);
//		System.out.println(h);
		for(Entry a:h.entrySet()){
			System.out.println(a.getKey()+"-"+a.getValue());
		}
		
	}
}
