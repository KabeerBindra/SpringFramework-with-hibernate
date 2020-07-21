package Products;

public class ProductDetails {
private String productID;
private String productName;
private Double price;
private Integer stock;
public ProductDetails(String productID, String productName, Double price, Integer stock) {
	
	this.productID = productID;
	this.productName = productName;
	this.price = price;
	this.stock = stock;
}
public ProductDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public String getProductID() {
	return productID;
}
public void setProductID(String productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Integer getStock() {
	return stock;
}
public void setStock(Integer stock) {
	this.stock = stock;
}
}
