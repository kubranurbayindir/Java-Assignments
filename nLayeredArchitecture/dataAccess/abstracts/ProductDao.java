package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao { // �r�n ekleme, silme g�ncelleme 
	void add(Product product); 
	void update(Product product);
	void delete(Product product);
	Product get(int id);// �r�n arama //product d�nd�r�yoruz get operasyonu ile int id vererek asl�nda burda bana bi tane id ver veirtaban�ndaki o id li �r�n� ver ondan Product �a��r�yoruz.
	// Product[] getAll(); //product arraye d�nd�rebilirir.z
	//birde �r�n listesi d�nd�rebiliriz. //listeleme array laz�m.
	//fakat arrayler sabit yap�lard�r. 1 arraye 3 eleman ekleriz. bi tane daha eklersek bi �r�n daha arraye referans atamal� ve array u�ar gider.
	//arraylist kullan�r�z o zaman 
	// normal array sabit yap�dad�r ve index say�s�n� ge�emeyiz ekstra
	//arraylist dinamiktir istedi�imiz kadr eleman ekleyebiliriz. �zel bir dizi yap�dad�r. i�ine hangi tip generic yap�lar� kullan�r�z. Integer cinsinden.
	List<Product> getAll();

}
