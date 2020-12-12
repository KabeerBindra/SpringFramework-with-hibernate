package com.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;


@Entity
 @Table(name="Product") 
public class Product {


	public Product() {
		super();
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)  private int id;
    private String name;
    private String category;
    private String status;
    private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
   
	 @Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", category=" + category + ", status=" + status + ", price="
					+ price + "]";
		}
}


