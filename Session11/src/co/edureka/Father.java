package co.edureka;

// Bean
public class Father {
	
	// Attributes
	String fname;
	String lname;
	long money;
	
	public Father(){
		
	}
	
	public Father(String fname, String lname, long money) {
		this.fname = fname;
		this.lname = lname;
		this.money = money;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", money=" + money + "]";
	}
	
}
