package dailyAssignments_21May;

public class Square {

	public int findSquare(int number){
		
		return number*number;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		int result = s.findSquare(5);
		System.out.println("The square number is " + result);
		
}
}