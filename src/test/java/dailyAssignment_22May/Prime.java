package dailyAssignment_22May;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();

boolean p = true;

if(num <=1) {
	p=false;
} else {
	
	for(int i =2 ;i<= num/2; i++) {
		
		if(num % i ==0)
		{
			p = false;
			break;
		}
	}
}

if(p) {
	System.out.println(num + " is Prime");
	
} else {
	System.out.println( num + " is Not Prime");
}

sc.close();
	}

}
