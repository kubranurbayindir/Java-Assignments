package intro;

public class TrialLessonOne {

	public static void main(String[] args) {
		
		//example one
		int sayi1 = 28;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk>sayi2) {
			enBuyuk = sayi1;
		}
		System.out.println("En b�y�k say�: " + enBuyuk);
		System.out.println("******************");
		//example two
		//say� bulma
		int[] bul = {1,2,3,4,5,6,7,8,9,10};
		int ara = 5;
		boolean varMi = false;
		for(int say : bul) {
			if(say==ara) {
			varMi = true;
			break;
			}}
		if(varMi) {
			System.out.println("Say� vard�r.");
		}else System.out.println("Say� yoktur.");
		System.out.println("******************");
		//example three
		int asal=2;
		boolean isPrime=true;
		for(int i =2 ; i<asal; i++) {
			if(asal % i == 0) {
				isPrime = false;
			}
		}
			if (isPrime) {
				System.out.println("Say� asald�r.");
			} else 
				System.out.println("Say� asal de�ildir.");
			System.out.println("******************");	
		//example four-1
			char harf='E';
			if (harf == 'A' || harf == 'I' || harf =='O' || harf =='U') {
				System.out.println("Harf kal�n seslidir.");
			} else if (harf == 'E' || harf == '�' || harf =='�' || harf =='�') 
				System.out.println("Harf ince seslidir.");
			System.out.println("******************");
		//example four-2
			
			System.out.println("******************");
		//example five
			//6 ---> 1,2,3 toplam� 6'd�r. M�kemmel say�d�r. 
			int muk=5;
			int tot = 0;
			for(int k =1 ; k<muk ; k++) {
				if (muk % k == 0) {
					tot = tot +k;
				}
			}
			if (tot == muk) {
				System.out.println("M�kemmel say�d�r.");
			}else {
				System.out.println("M�kemmel say� de�ildir.");}
		}

}
