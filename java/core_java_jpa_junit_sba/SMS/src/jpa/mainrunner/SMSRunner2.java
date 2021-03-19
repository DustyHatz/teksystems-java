package jpa.mainrunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SMSRunner2 {

	public static void main(String[] args) {
		
		testDBConnection();
		
		}

		private static void testDBConnection() {
			
			// Equivalent to connecting to DB
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
			EntityManager em = emf.createEntityManager();
			
			// Business Logic like crud operations
			System.out.println(em.isOpen()?"CONNECTED..." : "NOT CONNECTED...");
			
			em.close();
			emf.close();
		}

}
