package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Product;


import java.util.List;



@Component
@Transactional 
 
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private  SessionFactory sf;
	
	
	
    public void addProduct(Product product) {
        Session session = sf.getCurrentSession();
  
      session.saveOrUpdate(product);
     System.out.print(product);
        session.flush();
        
    }

    public Product getProductById(int id) {
        Session session = sf.getCurrentSession();
        Product product = (Product) session.get(Product.class, id);
        session.flush();

        return product;
    }

    public List<Product> getAllProducts() {
        Session session = sf.getCurrentSession();
List<Product> list = session.createQuery(" from Product").list();
		
		
		return list;
    }

    public void deleteProduct (int id) {
        Session session = sf.getCurrentSession();
        session.delete(getProductById(id));
        session.flush();
    }
}