package Experiment1;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		
		System.out.println("The area of the circle with the radius " + n + " is :" +(3.14*(n*n)));
		System.out.println("The perimeter of the circle with radius " + n + " is :" + (2*3.14*n));
// user will have to provide the radius for the circle		
		
	}

}
