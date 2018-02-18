package co.edureka;

interface Car{
	void paintCar();
}

class SUV implements Car{
	public void paintCar(){
		System.out.println("--Painting SUV Car as Black--");
	}
}

class CarDecorator implements Car{
	
	Car car; // HAS-A
	
	CarDecorator(Car c){
		car = c;
	}
	
	public void paintCar(){
		car.paintCar();
	}
}

class SportsSUV extends CarDecorator{
	
	SportsSUV(Car c){
		super(c);
	}
	
	public void paintCar(){
		System.out.println("==SportsSUV is in Action==");
		super.paintCar();
	}
}

class UtilitySUV extends CarDecorator{
	
	UtilitySUV(Car c){
		super(c);
	}
	
	public void paintCar(){
		System.out.println("**UtilitySUV is in Action**");
		//super.paintCar();
	}
}

