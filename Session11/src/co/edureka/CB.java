package co.edureka;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	CA ca; // HAS-A Relation

	public CA getCa() {
		return ca;
	}

	// Setter Injection, will take place automatically without mentioning it in XML file
	@Autowired
	public void setCa(CA ca) {
		this.ca = ca;
	}

}
