package intro;

public class Main {

	public static void main(String[] args) {
		//camelSpace
		//Don't repeat yourself!!!
		String internetSubeButon = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButon);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar bugun d��t�");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar bug�n y�kseldi.");
		}else{
			System.out.println("Dolar bug�n de�i�medi.");
		}
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "�ift�i Kredi";
		String kredi5 = "MSE Kredi";
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler = {"H�zl� Kredi",
				"Mutlu Emekli Kredi",
				"Konut Kredi",
				"�ift�i Kredi",
				"MSE Kredi"
				};
		//foreach
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
		
		//best option
		for(int i=0; i<krediler.length ; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayiler1 = {1,2,3,4,5};
		int[] sayiler2 = {10,20,30,40,50};
		sayiler1 = sayiler2;
		sayiler2 [0] = 100;
		System.out.println(sayiler1[0]);
		
		String sehir1 = "ANKARA";
		String sehir2 = "�STANBUL";
		sehir1 = sehir2 ;
		sehir2 = "GAZ�ANTEP";
		System.out.println(sehir1);
		
	}

}
