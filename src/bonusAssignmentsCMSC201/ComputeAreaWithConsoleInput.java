package bonusAssignmentsCMSC201;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a radius
		System.out.print("Enter a number of radius: ");
		double radius = input.nextDouble();
		
		// Compute area of circle
		double area = radius * radius * 3.14159;
		
		// Display result
		System.out.println("The area for the circle of radius " + 
				radius + " is " + area);
		input.close();
	}

}
