package bonusAssignmentsCMSC201;

import java.util.Scanner;

public class Chapter3MPLProjects {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day:" );
		int todaysDay = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:" );
		int numOfDaysElapsed = input.nextInt();
		
		int futureDay = ((todaysDay + numOfDaysElapsed) % 7);
		String dayOfWeek = "";
		
		
		switch(todaysDay){
            case 0: dayOfWeek = "Sunday";
                    break;
            case 1: dayOfWeek = "Monday";
                    break; 
            case 2: dayOfWeek = "Tuesday";
                    break;
            case 3: dayOfWeek = "Wednesday";
                    break;
            case 4: dayOfWeek = "Thursday";
                   break;
            case 5: dayOfWeek = "Friday";
                    break;
            case 6: dayOfWeek = "Saturday";
                    break;
			default: dayOfWeek = " an invalid starting day. Today's day must be 0-6.";
        }
		
		switch(futureDay){
        	case 0: System.out.printf("Today is %s and the future day is Sunday", dayOfWeek);
        			break;
        	case 1: System.out.printf("Today is %s and the future day is Monday", dayOfWeek);
                	break; 
        	case 2: System.out.printf("Today is %s and the future day is Tuesday", dayOfWeek);
                	break;
        	case 3: System.out.printf("Today is %s and the future day is Wednesday", dayOfWeek);
                	break;
        	case 4: System.out.printf("Today is %s and the future day is Thursday", dayOfWeek);
               		break;
        	case 5: System.out.printf("Today is %s and the future day is Friday", dayOfWeek);
                	break;
        	case 6: System.out.printf("Today is %s and the future day is Friday", dayOfWeek);
                	break;
        }
		
		input.close();
	}
}
