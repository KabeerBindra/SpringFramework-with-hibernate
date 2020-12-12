package com.home;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

	 @RequestMapping("/productList/viewProduct/{id}")
	    public String viewProduct(@PathVariable int id, Model model) throws IOException{

	        Product product = productDao.getProductById( id);
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
	        
	         model.addAttribute("product", product);
	         System.out.print(product);
	        return "addProduct";
	    }
	   
	    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
	    public String addProductPost(@ModelAttribute("product") Product product) {
	        productDao.addProduct(product);
	        System.out.print(product);
	        return "redirect:/admin/productInventory";
	    }
}
