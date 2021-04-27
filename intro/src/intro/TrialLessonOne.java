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
		System.out.println("En büyük sayý: " + enBuyuk);
		System.out.println("******************");
		//example two
		//sayý bulma
		int[] bul = {1,2,3,4,5,6,7,8,9,10};
		int ara = 5;
		boolean varMi = false;
		for(int say : bul) {
			if(say==ara) {
			varMi = true;
			break;
			}}
		if(varMi) {
			System.out.println("Sayý vardýr.");
		}else System.out.println("Sayý yoktur.");
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
				System.out.println("Sayý asaldýr.");
			} else 
				System.out.println("Sayý asal deðildir.");
			System.out.println("******************");	
		//example four-1
			char harf='E';
			if (harf == 'A' || harf == 'I' || harf =='O' || harf =='U') {
				System.out.println("Harf kalýn seslidir.");
			} else if (harf == 'E' || harf == 'Ý' || harf =='Ö' || harf =='Ü') 
				System.out.println("Harf ince seslidir.");
			System.out.println("******************");
		//example four-2
			
			System.out.println("******************");
		//example five
			//6 ---> 1,2,3 toplamý 6'dýr. Mükemmel sayýdýr. 
			int muk=5;
			int tot = 0;
			for(int k =1 ; k<muk ; k++) {
				if (muk % k == 0) {
					tot = tot +k;
				}
			}
			if (tot == muk) {
				System.out.println("Mükemmel sayýdýr.");
			}else {
				System.out.println("Mükemmel sayý deðildir.");}
		}

}
