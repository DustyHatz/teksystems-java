package week8EmployeeAppJpa.entities;

public class TeachingStaff extends Staff {
	
	private String qualification;
	private String subjectExperties;
	
	
	// default constructor
	public TeachingStaff() {
		super();
	}
	
	// constructor
	public TeachingStaff(int sId, String sName, String qualification, String subjectExperties) {
		super(sId, sName);
		this.qualification = qualification;
		this.subjectExperties = subjectExperties;
	}
	
	

}
