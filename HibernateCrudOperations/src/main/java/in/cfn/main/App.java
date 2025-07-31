package in.cfn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.cfn.entities.User;


public class App {
	public static void main(String[] args) {
		
//		User user1 = new User("Karan","karan@gmail.com","k123","Male","Delhi");
//		User user2 = new User("Arjun","arjun@gmail.com","a123","Male","Patna");
		User user2 = new User("Krishna","krishna@gmail.com","kr123","Male","Dwarka");
		
		Configuration cfg = new Configuration();
		cfg.configure("/in/cfn/config/hibernate.cfg.xml");
		
		
//		Session : it provide crud operation methods 
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		=-=-=-=- INSERT OPERATION -=--=-=-=-
		
		try {
			session.save(user2);
			transaction.commit();
			System.out.println("USER DETAILS ADDED SUCCESSFULLY");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR");
			
		}
		
		
		
	}
}
