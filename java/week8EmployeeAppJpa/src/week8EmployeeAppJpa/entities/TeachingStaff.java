package week8EmployeeAppJpa.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class TeachingStaff extends Staff {
	
	@Basic
	private String qualification;
	@Basic
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

	// getters and setters
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectExperties() {
		return subjectExperties;
	}

	public void setSubjectExperties(String subjectExperties) {
		this.subjectExperties = subjectExperties;
	}

	// toString
	@Override
	public String toString() {
		return "TeachingStaff [qualification=" + qualification + ", subjectExperties=" + subjectExperties + "]";
	}

	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		result = prime * result + ((subjectExperties == null) ? 0 : subjectExperties.hashCode());
		return result;
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeachingStaff other = (TeachingStaff) obj;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (subjectExperties == null) {
			if (other.subjectExperties != null)
				return false;
		} else if (!subjectExperties.equals(other.subjectExperties))
			return false;
		return true;
	}
	
	
	

}
