package week8EmployeeAppJpaJunit.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractDao {

	// Connection string
	protected static EntityManagerFactory emf = null;
	protected static EntityManager em = null;
	private final static String PERSISTENCE_UNIT_NAME = "week8EmployeeAppJpaJunit";
	

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

}
