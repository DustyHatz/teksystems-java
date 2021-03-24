package jpa.service;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HelpersService {

	// Connection string
		protected static EntityManagerFactory emf = null;
		protected static EntityManager em = null;
		private final static String PERSISTENCE_UNIT_NAME = "SMS";
		

		// Connect method
		public static void connect() {
			try {
				emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				em = emf.createEntityManager();
			} catch (Exception e) {
				System.out.println("Error: Could not connect to database");
				System.out.println(e.getMessage());
			}
			
		}

		// Close connections method
		public static void dispose() {
		
			if(em.isOpen()) em.close();
			if(emf.isOpen()) emf.close();
		}
	
	
}
