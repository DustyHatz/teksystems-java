package jpa.entitymodels;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	private int cId; 				// unique course id
	@Basic
	private String cName; 			// name of the course
	@Basic
	private String cInstructorName; // name of the instructor
	
	
	// default constructor
	public Course() {
		super();
	}
	
	// constructor
	public Course(int cld, String cName, String cInstructorName) {
		super();
		this.cId = cld;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}
	
	// getters and setters
	public int getCld() {
		return cId;
	}
	public void setCld(int cld) {
		this.cId = cld;
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
		result = prime * result + cId;
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
		if (cId != other.cId)
			return false;
		return true;
	}

	
}
