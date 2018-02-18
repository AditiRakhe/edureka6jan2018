package co.edureka;

abstract class Plan{
	
	int price;
	int data;
	
	abstract void setPlanDetails();
	abstract void showPlanDetails();
	
}

class Plan2G extends Plan{
	void setPlanDetails(){
		price = 100;
		data = 1;
	}
	
	void showPlanDetails(){
		System.out.println("Plan 2G is for \u20b9"+price+" and shall provide "+data+"GB of data");
	}
}

class Plan3G extends Plan{
	
	void setPlanDetails(){
		price = 200;
		data = 3;
	}
	
	void showPlanDetails(){
		System.out.println("Plan 3G is for \u20b9"+price+" and shall provide "+data+"GB of data");
	}
}

class Plan4G extends Plan{
	
	void setPlanDetails(){
		price = 300;
		data = 5;
	}
	
	void showPlanDetails(){
		System.out.println("Plan 4G is for \u20b9"+price+" and shall provide "+data+"GB of data");
	}
}


public class PlanFactory {
	
	private PlanFactory(){
		
	}

	static Plan getPlan(int type){
		
		Plan plan=null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;
			case 3:
				plan = new Plan3G();		
				break;
			case 4:
				plan = new Plan4G();
				break;

		}
		
		plan.setPlanDetails();
		
		return plan;
		
	}
	
}
