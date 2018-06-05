package bonusAssignmentsCMSC201;

/* File: AvgSpeed.java
 * * Description: The program finds average speed of a runner
 * * Class: CMSC 201
 * * Author: Gabriel Feliz
 * * Date: 01/25/2018
 */

public class AvgSpeed {

	public static void main(String[] args) {
		
		/* Calculate 1 hour, 40 minutes, and 35 seconds run by the runner
		   in terms of hours */
		
		// There are 3600 seconds in an hour
		double secondsRunInHours = 35 / (3600);
		
		// There are 60 minutes in an hour
		double minutesRunInHours = 40 / (60);
		double totalHoursRun = 1 + minutesRunInHours + secondsRunInHours;
		
		/* Calculate the 24 miles run by the runner 
		   in terms of kilometers */
		
		// There are 1.6 kilometers in 1 mile
		double milesRunInKilometers = 24 * 1.6;
		
		
		// Calculate average speed in kilometers per hour
		double averageSpeed = (int) (milesRunInKilometers) / totalHoursRun;
		
		// Display average speed of the runner
		System.out.println("The average speed of the runner is " + 
				averageSpeed + " km/h");
	}

}
