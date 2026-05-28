package dailyAssignment_22May;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student marks :");
		int mark = sc.nextInt();
		
		if (mark > 35) {
			System.out.println("Student is Passed");
		}else {
			System.out.println("Student is Failed");
			
		}
		sc.close();
	}

}

