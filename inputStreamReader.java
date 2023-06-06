package Experiment1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamReader {
	public static void main(String[] args) {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the input: ");
    try {
    	String input = reader.readLine();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}
}
