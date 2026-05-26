package UST.SeleniumJava;

public class MethodExample {
	
	// Method without return type
	
			public void add() {
				int a = 10;
				int b = 20;
				int c = a+b;
				System.out.println("Addition value in add method " + c);
			}
			//Method with return type
			
			public int add1() {
				int a =10;
				int b =30;
				int c = a+b;
				return c;
			}
 
			 public void multiply()
			 {
				 int a=10;
				 int b=20;
				 int c=a*b;
				 System.out.println("Value of multiply is " + c);
			 }
	

	public static void main(String[] args) {
		
		MethodExample md = new MethodExample();
		md.add();
		int result=md.add1();
		System.out.println("Value of add1 method is " + result);
		md.multiply();
		
	}

}
