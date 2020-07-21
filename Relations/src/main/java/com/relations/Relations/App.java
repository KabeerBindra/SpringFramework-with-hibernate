package com.relations.Relations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import Products.OrderDetails;
import Products.ProductDetails;
import hql.Kapoors;
import mappings.Authorz;
import mappings.Books;
import mappings.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Configuration con = new Configuration().configure();
//        SessionFactory sf = con.buildSessionFactory();
//        Session s =sf.openSession();
//        
//        Transaction tx = s.beginTransaction();
//       Books obj = new Books();
//        	obj.setId(10); obj.setIsbn("Se122");obj.setName("Sunny llllu");obj.setPages(922);obj.setTitle("RedSexynnHOt Book");
//        	obj.setPrice(1111.22);
//        	
//
//      Authorz author = new Authorz();
//      obj.getAuthor().add(author);
//      author.setAuthorId(201);
//      author.setAuthorName("Ceolo");
//    
//;      author.getBooks().add(obj);
//     // author.setBook(obj);
//     s.save(author);
//        s.save(obj);
//    //    session.save(book2);
//        tx.commit();
//        s.close();
    	Configuration config = new Configuration().configure();
    ServiceRegistry sr =new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    SessionFactory sf =config.buildSessionFactory(sr);
    Session session =sf.openSession();
    session.beginTransaction();
//    int i=0;
//Random r = new Random();
//i=r.nextInt(100);
//
//		Kapoors obj=new Kapoors("Shabber"+i+"", "jawani", "dewani", "kabira",(float) ((1160+i)*2.2) , i,i);
//		session.save(obj);
//		
////	List<Kapoors>lists=	o.list();
////	for(Kapoors details:lists) {
////		System.out.println(details);
////		
////	}
////	
//		
//		//List<Kapoors> Kapoors = o.list();
////		Query query = session.createQuery("select nepotism,salary,name from Kapoors ");
////		@SuppressWarnings("unchecked")
////		List<Object[ ]>students = (List<Object[]>)query.list();
////		for(Object[] laram : students) {System.out.println("Nepotism \t  "+laram[0]+"Salary \t  "+laram[1]+"Name \t     "+laram[2]);}
//			Query query = session.createQuery("select name ,salary,nepotism from Kapoors s   where s.nepotism>60");
//			List<Object[]> objects = (List<Object[]>)query.list();
//			for(Object[] s : objects) {System.out.println("Name \t"+ s[0] +"Salary \t "+  s[1] +" nepotism \t"+s[2]);}
//			Query que = session.createQuery("select sum(salary) from Kapoors");
//			Object sal = que.uniqueResult();
//			System.out.println(sal);
//			int b =85;
//			Query q = session.createQuery("select avg(salary) from Kapoors where nepotism> :b");
//			q.setParameter("b",b);
//			Object result = q.uniqueResult();
//			System.out.println(result);
//			SQLQuery sql = session.createSQLQuery("select * from KAPOORS where salary>2.0");
//		sql.addEntity(Kapoors.class);
//		List<Kapoors> del = sql.list();
//		for(Kapoors data :del) {System.out.println(data);}
//			Query queue = session.createSQLQuery("select name,films,nepotism from Kapoors ");
//			queue.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//			List<Object>  ans = queue.list();
//			System.out.println("Mapping ka answer");
//			for(Object a : ans) {
//				
//				Map mapping = (Map) a;
//			
//				System.out.println(mapping.get("name")+"\n"+mapping.get("films")+"\n"+mapping.get("nepotism"));
//			}
//			Kapoors kapu;
//			Query qq= session.createQuery("select name from Kapoors");
//			qq.setFirstResult(3);
//			List runs = qq.list();
//			for(Object karan : runs) {System.out.println(karan);}
//			System.out.println("Criterias");
//			Criteria c = session.createCriteria(Kapoors.class);
//			c.add(Restrictions.gt("nepotism",90));
//			List lists = c.list();
//		//	for(Object kabeer : lists) {System.out.println(kabeer);}
//		for(Iterator<Object>iterator=lists.iterator(); iterator.hasNext();) {
//		kapu = (Kapoors) iterator.next();
//			System.out.println(kapu);
//			System.out.println("Ho gaya");
//		}	
    ProductDetails pd = new ProductDetails();
    OrderDetails od = new OrderDetails();
    String productID="100";
    int quantity =10, stock=0; double price=0.0f;
    Query q = session.createQuery("from ProductDetails where productID="+productID);
    List<ProductDetails> pds = new ArrayList<>();
    pds=q.list();
    for(Iterator it =pds.iterator();it.hasNext();) {
    	ProductDetails product = (ProductDetails) it.next();
    	String productname = product.getProductName();
     stock = product.getStock();
     price = product.getPrice();
    	
    	
    }
    int update = stock-quantity;
    double totalPrice= price*quantity;
    q= session.createQuery("update ProductDetails set stock =:update where productID=:productID");
    q.setString("productID",productID );
    q.setInteger("update", update);
    int row = q.executeUpdate();
   od.setProductID(productID);
   od.setQuantity(quantity);
   od.setTotalPrice(totalPrice);
    
    System.out.println("It firesd"+row);
   // session.save(pd);
    session.save(od);
//    ProductDetails pd = new ProductDetails("100","TOYS",300.21,1000);
//    
//    session.save(pd);
    
    
    
    
    
			session.getTransaction().commit();
    }
}
