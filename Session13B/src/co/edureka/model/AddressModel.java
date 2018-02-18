package co.edureka.model;

// Model
public class AddressModel {

	int aid;
	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdrsLine() {
		return adrsLine;
	}
	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "AddressModel [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}
}
