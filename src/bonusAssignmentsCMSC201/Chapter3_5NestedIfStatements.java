package bonusAssignmentsCMSC201;

import java.util.Scanner;

public class Chapter3_5NestedIfStatements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age = input.nextInt();
		
		String choice = input.next();

		if (age <= 21)
		{
			switch (choice)
			{
				case "S": System.out.println("vegetable juice");
							break;
			
				case "T": System.out.println("cranberry juice");
							break;
				
				case "B": System.out.println("soda");
							break;
				
				default: System.out.println("invalid menu selection");
				
			}
		}
		else
		{
			switch (choice)
			{
				case "S": System.out.println("cabernet");
							break;
			
				case "T": System.out.println("chardonnay");
							break;
				
				case "B": System.out.println("IPA");
							break;
				
				default: System.out.println("invalid menu selection");
			}
		}
		
		input.close();
	}

}
