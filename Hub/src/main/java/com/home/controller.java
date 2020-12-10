package com.home;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.dao.ProductDao;

import com.model.Product;


@Controller

public class controller {
	  @Autowired 
	  private ProductDao productDao;
	
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	 @RequestMapping( "productList")
	    public String getProducts(Model model) {
		 List<Product> products = productDao.getAllProducts();
	        model.addAttribute("products", products);

	        return "productList";
	 }

	 @RequestMapping("/productList/viewProduct/{productId}")
	    public String viewProduct(@PathVariable String productId, Model model) throws IOException{

	        Product product = productDao.getProductById(productId);
	        model.addAttribute(product);

	        return "viewProduct";
	 }

	    @RequestMapping("/admin")
	    public String adminPage() {
	        return "admin";
	    }

	    @RequestMapping("/admin/productInventory")
	    public String productInventory(Model model) {
	        List<Product> products = productDao.getAllProducts();
	        model.addAttribute("products", products);

	        return "productInventory";
	    }


	    @RequestMapping("/admin/productInventory/addProduct")
	    public String addProduct(Model model) {
	        Product product = new Product();
	        product.setProductCategory("instrument");
	        product.setProductCondition("new");
	        product.setProductStatus("active");

	        model.addAttribute("product", product);

	        return "addProduct";
	    }
	    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
	    public String addProductPost(@ModelAttribute("product") Product product) {
	        productDao.addProduct(product);

	        return "redirect:/admin/productInventory";
	    }
}