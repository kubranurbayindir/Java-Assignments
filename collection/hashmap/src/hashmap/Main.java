package hashmap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
        
        HashMap<Integer, String> etiyastudent = new HashMap<Integer, String>();
       
        etiyastudent.put(0, "Engin");
        etiyastudent.put(1, "Kübra");
        etiyastudent.put(2, "Merve");
        etiyastudent.put(3, "Furkan");

		System.out.println(etiyastudent.get(0));
//		
//		list.myToString();
//
//		Object[] test;
//		test = etiyastudent.list();
		
//		for (Object object : test) {
//			System.out.println(object);
//		}
//		
		for (Integer i : etiyastudent.keySet()) {
			  System.out.println(i);
			}
		
		System.out.println(etiyastudent.size());
		
		etiyastudent.remove(2);
		System.out.println(etiyastudent.size());
		
		etiyastudent.clear();
		System.out.println(etiyastudent.size());
		
		
		
	}

}
