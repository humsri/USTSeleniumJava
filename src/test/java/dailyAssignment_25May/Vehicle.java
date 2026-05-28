package dailyAssignment_25May;

public class Vehicle {
	
	void drive() {
		
		System.out.println("Driving a vehicle");
	}

	public static void main(String[] args) {
		
     Car c = new Car();
     c.drive();
	}

}

class Car extends Vehicle{
	
	void drive() {
		System.out.println("Repairing a car");
	}
}
