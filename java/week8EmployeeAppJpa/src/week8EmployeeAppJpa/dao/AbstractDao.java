package week8EmployeeAppJpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractDao {

	// Connection string
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	private final String PERSISTENCE_UNIT_NAME = "week8EmployeeAppJpa";
	

	// Connect method
	public void connect() {
		
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		
	}

	// Close connections method
	public void dispose() {
	
		if(em.isOpen()) em.close();
		if(emf.isOpen()) emf.close();
	}

}
