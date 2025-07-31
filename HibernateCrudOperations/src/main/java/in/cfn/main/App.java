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
//		User user2 = new User("Krishna","krishna@gmail.com","kr123","Male","Dwarka");
		
		Configuration cfg = new Configuration();
		cfg.configure("/in/cfn/config/hibernate.cfg.xml");
		
		
//		Session : it provide crud operation methods 
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		=-=-=-=- INSERT OPERATION -=--=-=-=-
		
//		try {
//			session.save(user2);
//			transaction.commit();
//			System.out.println("USER DETAILS ADDED SUCCESSFULLY");
//			
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR");
//			
//		}
		
		
//		-=-=-=-=-=- SELECT OPERATION -=-=-=-=-
		
//		try {
//			User user = session.get(User.class, 1);
//			if(user != null) {
//				System.out.println(user.getId());
//				System.out.println(user.getName());
//				System.out.println(user.getEmail());
//				System.out.println(user.getPassword());
//				System.out.println(user.getEmail());
//				System.out.println(user.getCity());
//			}else {
//				System.out.println("User Not Found");
//			}
//		
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
//		=-=-=-=- UPDATE OPERATION -=--=-=-=-
		
//		try {
//			User user = session.get(User.class, 1);
//			user.setCity("Banglore");
//			session.saveOrUpdate(user);
//			transaction.commit();
//			System.out.println("USER DETAILS UPDATED SUCCESSFULLY");
//			
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("USER DETAILS NOT UPDATED DUE TO SOME ERROR");
//			
//		}
		
		
		
//		=-=-=-=- UPDATE OPERATION -=--=-=-=-
		
		try {
			User user = new User();
			user.setId(2);
			
			session.delete(user);
			transaction.commit();
			System.out.println("USER DETAILS DELETED SUCCESSFULLY");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("USER DETAILS NOT DELETED DUE TO SOME ERROR");
			
		}
		
	}
}
