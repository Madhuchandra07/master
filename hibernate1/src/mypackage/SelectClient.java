package mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    Employee e1=null;
	    
	    e1.setFirstName("Dinesh Rajput");//Updated Name
		  Session session2 = factory.openSession();
		  Employee emp2 =(Employee)session2.get(Employee.class, 115);
		  session2.update(e1);
		  System.out.println(e1.getFirstName());

	}

}





