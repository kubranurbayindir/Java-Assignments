
//collections geliştirilmiş array tipleridir. Günmğzde arrayler i kullanımı oldukça az.

package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ankara"); //list arkaplanda array tutuyor.
		list.add("İstanbul");
		//list.remove(0);
		//list.remove("İstanbul");
		list.add( 0, "İzmir");
		list.set(0, "Adana");
		boolean result = list.contains("Adana");
		String ilkEleman = list.get(0); //listenin ilk elemanı nedir. buna foreachde getirebiliriz.
				
		for (String city : list) {
			System.out.println(city);
		}
		
		System.out.println("Listede var mı? " + result);
		
		list.forEach((c) -> {
			System.out.println(c.toUpperCase());
		
		}); 

	}

}
