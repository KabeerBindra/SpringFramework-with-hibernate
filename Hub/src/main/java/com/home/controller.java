package com.home;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.ProductDao;

import model.Product;

@Controller

public class controller {

    private ProductDao productDao = new ProductDao();
	
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	 @RequestMapping( "productList")
	    public String getProducts(Model model) {
	        List<Product> productList = productDao.getProductList();
	        Product product = productList.get(0);
	        model.addAttribute(product);

	        return "productList";
	    }
}
