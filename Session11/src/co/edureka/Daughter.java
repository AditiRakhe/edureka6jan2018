package co.edureka;

public class Daughter extends Father{

	int vehicles;

	public Daughter() {
		
	}
	
	public Daughter(int vehicles) {
		this.vehicles = vehicles;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Daughter [fname=" + fname + ", lname=" + lname + ", money=" + money + ", vehicles=" + vehicles + "]";
	}
	
}
