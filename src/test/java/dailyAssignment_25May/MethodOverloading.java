package dailyAssignment_25May;

public class MethodOverloading {
	
	//Method with 2 integers
	
	void add(int a, int b) {
		
		int sum = a + b;
		
		System.out.println("Sum of 2 integers = " + sum);
	}

	//Overloaded method with 3 integers
	void add(int a, int b, int c) {
		
		int sum = a + b + c;
		
		System.out.println("Sum of 3 integers = " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		
		obj.add(10,20);
		
		obj.add(10,20,30);
		
	}

}
