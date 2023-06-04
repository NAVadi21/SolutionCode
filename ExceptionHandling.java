package Experiment2;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 try {
		 int num = scanner.nextInt();
		 double result = (10 / num);
		 System.out.println("Result: " + result);
		 } catch (ArithmeticException e) {
		 System.out.println("Error: Cannot divide by zero!");
		 } catch (Exception e) {
		 System.out.println("Error: Invalid input!");
		 } finally {
		 scanner.close();
		 }
		 }
			
	}
