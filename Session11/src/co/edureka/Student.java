package co.edureka;

import java.util.List;

public class Student {

	// Attributes
	int roll;
	String name;
	int std;
	int age;
	Address adrs; // HAS-A Relation | 1 to 1
	
	List<String> subjects; // HAS-A Relation | 1 to many
	//List<Address> adrsList;
	
	public Student(){
		System.out.println("Student Object Constructed");
	}
	
	// Constructor Injection Technique
	public Student(Address adrs){
		System.out.println("Student Object Constructed with Address Input");
		this.adrs = adrs;
	}
	
	public Student(int roll, String name, int std, int age, Address adrs) {
		this.roll = roll;
		this.name = name;
		this.std = std;
		this.age = age;
		this.adrs = adrs;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdrs() {
		return adrs;
	}

	// Setter Injection Technique
	public void setAdrs(Address adrs) {
		System.out.println("Student Object Setter with Address Input");
		this.adrs = adrs;
	}
	

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", std=" + std + ", age=" + age + ", adrs=" + adrs + "]";
	}
	
}
