package Prototype.ShallowClone;

import java.util.Date;

/**
 * shallow clone
 */
public class Sheep implements Cloneable{
	private String sname;
	private Date birthday;

	public Sheep(String sname, Date date) {
		this.sname = sname;
		this.birthday = date;
	}

	//directly invoking the object's method
	@Override
	protected Object clone() throws CloneNotSupportedException {
       Object obj = super.clone();
       return obj;
    }

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}