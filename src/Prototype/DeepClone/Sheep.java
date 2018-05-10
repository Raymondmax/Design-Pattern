package Prototype.DeepClone;

import java.util.Date;

public class Sheep implements Cloneable{
	private String sname;
	private Date birthday;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//directly invoking the object's method
	    Object obj = super.clone();
	    //deep clone:clone all properties of the object
	    Sheep s = (Sheep) obj;
	    s.birthday = (Date) this.birthday.clone();
	    return s;
	}
	
	public Sheep(String sname, Date date) {
		this.sname = sname;
		this.birthday = date;
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
