package mypackage;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

public class Client {

	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    Employee e1=new Employee();  
	    e1.setId(117);  
	    e1.setFirstName("sonoo");  
	    e1.setLastName("jaiswal");  
	      
	    session.persist(e1);//persisting the object  
	      
	    t.commit();//transaction is committed  
	    session.close();
	    
	    e1.setFirstName("Dinesh Rajput");//Updated Name
	  //Create session again
	  Session session2 = factory.openSession();
	  Employee emp2 =(Employee)session2.get(Employee.class,116 );
	//below we try to make on detached object with id 100 to persistent state by using update method of hibernate
	  session2.update(e1);//It occurs the exception NonUniqueObjectException because emp2 object is having employee with same empid as 100. In order //to avoid this exception we are using merge like given below instead of session.update(emp1);

	  System.out.println(e1.getFirstName());
	  //session2.merge(emp1); 
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	}  
}
