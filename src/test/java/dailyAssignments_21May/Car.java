package dailyAssignments_21May;

public class Car {
	
	String brand;
	String model;
	double price;
	
	public void startCar() {
		System.out.println("Car started");
		
	}
	
	public void stopCar() {
		System.out.println("Car stopped");
		
	}

	public static void main(String[] args) {
	
    Car c = new Car();
    c.brand="TATA TIAGO";
    c.model="XM";
    c.price= 5000000;
    
    c.startCar();
    c.stopCar();
   
    
	}

}

