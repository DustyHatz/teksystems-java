package week8EmployeeAppJpa.entities;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="TS")
public class NonTeachingStaff extends Staff {
	
	@Basic
	private String areaExperties;

	
	// default constructor
	public NonTeachingStaff() {
		super();
	}
	
	// constructor
	public NonTeachingStaff(int sid, String sName) {
		super(sid, sName);
	}

	// constructor
	public NonTeachingStaff(int sid, String sName, String areaExperties) {
		super(sid, sName);
		this.areaExperties = areaExperties;
	}

	// getters and setters
	public String getAreaExperience() {
		return areaExperties;
	}

	public void setAreaExperience(String areaExperience) {
		this.areaExperties = areaExperience;
	}

	
	// toString
	@Override
	public String toString() {
		return "NonTeachingStaff [areaExperience=" + areaExperties + "]";
	}

	
	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((areaExperties == null) ? 0 : areaExperties.hashCode());
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
		NonTeachingStaff other = (NonTeachingStaff) obj;
		if (areaExperties == null) {
			if (other.areaExperties != null)
				return false;
		} else if (!areaExperties.equals(other.areaExperties))
			return false;
		return true;
	}
	
	
	
	

}
