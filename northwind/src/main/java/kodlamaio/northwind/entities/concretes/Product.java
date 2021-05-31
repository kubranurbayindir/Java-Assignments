package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // anatasyon bazlı çalışma ile product javanın 1 entity olduğunu springe tanıtıyoruz.Sen 1 db nesnesisin diyoruz.
@Table(name="products") //db de hangi tabloya karşılık geleceğini tnıt.
public class Product {
	
	@Id //sorgular bu id ye göre yapılandırılacak. db ve diğer işlere primary keye tanıyıtoruz.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//tekrar anlatmak lazım otomatik at diye strateji yazıyoruz. //id nin nasıl arttırıldığını anlatmamız lazım. bu seçtiğimiz 1 1 arttığını gösteriri. 
	@Column(name="product_id")  //hangi kolana denk geliyor..
	private int id;

	@Column(name="category_id") 
	private int categoryId;

	@Column(name="product_name") 
	private String productName;

	@Column(name="unit_price") 
	private double unitPrice;

	@Column(name="units_in_stock") 
	private short unitsInStock;

	@Column(name="quantity_per_unit") 
	private String quantityPerUnit;
	
	public Product() {
	}
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public short getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
	
	

}
