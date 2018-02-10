package co.edureka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {

	@Id @GeneratedValue
	@Column(name="UID")
	Integer uid;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="ADDRESS")
	String address;
	
	public User(){
		
	}
	
	public User(Integer uid, String name, String email, String address) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
}
