package co.edureka;

import java.util.List;

public class Manager {

	Integer mid;
	String name;
	String email;
	Integer salary;
	
	List<Certificate> certificateList; // 1 - *

	public Manager(){
		
	}
	
	public Manager(Integer mid, String name, String email, Integer salary, List<Certificate> certificateList) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.certificateList = certificateList;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public List<Certificate> getCertificateList() {
		return certificateList;
	}

	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}
	
}
