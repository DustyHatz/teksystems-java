package week8EmployeeAppJpa.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Inheritence(strategy = Inheritence)
public class Staff {
	
	// fields
	@Id
	private int sid;
	@Basic
	private String sName;
	
	// default constructor
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// constructor
	public Staff(int sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}

	// getters and setters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	// toString
	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sName=" + sName + ", getSid()=" + getSid() + ", getsName()=" + getsName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		result = prime * result + sid;
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
		Staff other = (Staff) obj;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	
	
	
	

}
