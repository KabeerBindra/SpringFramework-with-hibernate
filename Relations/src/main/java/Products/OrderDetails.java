package Products;

public class OrderDetails {
private String productID;
private Integer quantity;
private Double totalPrice;
public String getProductID() {
	return productID;
}
public void setProductID(String productID) {
	this.productID = productID;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public Double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(Double totalPrice) {
	this.totalPrice = totalPrice;
}
@Override
public String toString() {
	return "OrderDetails [productId=" + productID + ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
}
public OrderDetails(String productID, Integer quantity, Double totalPrice) {
	super();
	this.productID = productID;
	this.quantity = quantity;
	this.totalPrice = totalPrice;
}
public OrderDetails() {
	super();
	// TODO Auto-generated constructor stub
}
}
