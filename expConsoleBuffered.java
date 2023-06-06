package Experiment1;
import java.io.Console;

public class expConsoleBuffered {

	public static void main(String[] args) {
		
		Console console = System.console();
		if(console == null) {
			System.out.println("Console unavailable"); // to check whether the console exists or not
			return;
		}
		
		String input = console.readLine("Enter Your input: ");
		// console is unavailable in this system
		// TODO Auto-generated method stub

	}

}
