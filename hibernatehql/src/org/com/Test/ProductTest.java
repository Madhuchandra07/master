package org.com.Test;

import org.com.hibernate1.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;





public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product p=new Product();
		/*p.setProductid(3);
		p.setPname("phone3");
		p.setPrice(30000);*/
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session s = factory.openSession();
		/*s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		System.out.println("success");*/
		System.out.println("sadsd");
		//select comp-lete table from the database
		/*Query q=s.createQuery("from Product p");
		System.out.println(q);
		List i=q.list();
		System.out.println("size"+i.size());
		Iterator i1=i.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			p=(Product)o;
			System.out.println(p.getProductid() +p.getPname()+p.getPrice());
		}*/
		Query qry=s.createQuery("select p.pname,p.price from Product p");
		List i=qry.list();
		Iterator it=i.iterator();
		while(it.hasNext())
		{
			Object o[]=(Object [])it.next();
			
			//System.out.println(p.getPname()+p.getPrice());
		}
	
	
		

	}

}
