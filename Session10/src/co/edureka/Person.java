package co.edureka;

public class Person {

	Integer pid;
	String name;
	String phone;
	String email;
	
	Address address; // Has-A Relation | 1 to 1

	public Person(){
		
	}
	
	public Person(Integer pid, String name, String phone, String email, Address address) {
		this.pid = pid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
