package co.edureka;

public class Client {

	public static void main(String[] args) {
		
		//Plan plan = PlanFactory.getPlan(4);
		//plan.showPlanDetails();
		
		//Car suv = new SUV();
		//suv.paintCar();
		
		/*Car sportsSuv = new CarDecorator(suv);
		sportsSuv.paintCar();
		
		UtilitySUV uSuv = new UtilitySUV(sportsSuv);
		uSuv.paintCar();*/
		
		/*Context context = new Context();

		State state = new InitialState();
		
		context.changeState(state);
		context.getState().showState();
		
		state = new FinalState();
		context.changeState(state);
		
		context.getState().showState();*/
		
		// Job is Opened for the Employee to service the Bike - OPEN
		// Employee is Serving the Bike 					  - IN_PROGRESS
		// Employee has finished the Job 					  - CLOSED
		
		
		DAO dao = new DBHelper();
		dao.insert();
		dao.update();
		dao.delete();
		dao.query();
		
	}

}
