package bonusAssignmentsCMSC201;
/* File: DisQuadratic.java
 * * Description: The program computes the discriminant of a quadration equation
 * * Class: CMSC 201
 * * Author: Gabriel Feliz
 * * Date: 01/25/2018
 */

public class DisQuadratic {
	
	public static void main(String[] args) {
		
		// Coefficients of equation 3x^2 + 4x + 5
		double a = 3;
		double b = 4;
		double c = 5;
	
		// Calculate discriminant
		double discriminant = Math.pow(b, 2.0) - (4 * a * c);
	
		// Display discriminant for 3x^2 + 4x + 5
		System.out.println("The discriminant for the equation 3x^2 + 4x + 5 is equal to " + discriminant);
	
	}

}
