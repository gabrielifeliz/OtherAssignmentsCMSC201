package bonusAssignmentsCMSC201;

import java.util.Scanner;

public class TriangleOfAsterisks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, j;
		System.out.print("Enter size of triangle: ");
		int n = input.nextInt();
		
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		input.close();
	}

}
