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
			
			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			em = emf.createEntityManager();
			
		}

		// Close connections method
		public static void dispose() {
		
			if(em.isOpen()) em.close();
			if(emf.isOpen()) emf.close();
		}
		
		public static void getCourseById(int cId) {
			
			if (Course.getCId() == null) {
				
			}
			
		}
	
	
}
