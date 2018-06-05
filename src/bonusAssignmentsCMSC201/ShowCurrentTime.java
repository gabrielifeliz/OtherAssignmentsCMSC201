package bonusAssignmentsCMSC201;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Obtain the total milliseconds since Midnight, Jan 1 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain total seconds
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = (int) (totalSeconds % 60);
		
		// Obtain total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Obtain current minute
		long currentMinute = (int) (totalMinutes % 60);
		
		// Obtain total hours		
		long totalHours = totalMinutes / 60;
		
		// Obtain current hour
		long currentHour = (int) (totalHours % 24);
		
		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");
	}

}
