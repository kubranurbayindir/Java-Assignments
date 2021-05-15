package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao { // ürün ekleme, silme güncelleme 
	void add(Product product); 
	void update(Product product);
	void delete(Product product);
	Product get(int id);// ürün arama //product döndürüyoruz get operasyonu ile int id vererek aslýnda burda bana bi tane id ver veirtabanýndaki o id li ürünü ver ondan Product çaðýrýyoruz.
	// Product[] getAll(); //product arraye döndürebilirir.z
	//birde ürün listesi döndürebiliriz. //listeleme array lazým.
	//fakat arrayler sabit yapýlardýr. 1 arraye 3 eleman ekleriz. bi tane daha eklersek bi ürün daha arraye referans atamalý ve array uçar gider.
	//arraylist kullanýrýz o zaman 
	// normal array sabit yapýdadýr ve index sayýsýný geçemeyiz ekstra
	//arraylist dinamiktir istediðimiz kadr eleman ekleyebiliriz. özel bir dizi yapýdadýr. içine hangi tip generic yapýlarý kullanýrýz. Integer cinsinden.
	List<Product> getAll();

}
