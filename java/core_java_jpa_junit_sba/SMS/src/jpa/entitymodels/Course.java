package jpa.entitymodels;

import javax.persistence.Entity;

@Entity
public class Course {
	
	private int cld; 				// unique course id
	private String cName; 			// name of the course
	private String cInstructorName; // name of the instructor
	
	
	// default constructor
	public Course() {
		super();
	}
	
	// constructor
	public Course(int cld, String cName, String cInstructorName) {
		super();
		this.cld = cld;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}
	
	// getters and setters
	public int getCld() {
		return cld;
	}
	public void setCld(int cld) {
		this.cld = cld;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcInstructorName() {
		return cInstructorName;
	}
	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}
	
	// hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cInstructorName == null) ? 0 : cInstructorName.hashCode());
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + cld;
		return result;
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (cInstructorName == null) {
			if (other.cInstructorName != null)
				return false;
		} else if (!cInstructorName.equals(other.cInstructorName))
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (cld != other.cld)
			return false;
		return true;
	}

	
}
