import java.util.Scanner;
import java.util.InputMismatchException;

public class AverageOfIntegers {
	public static void main (String [] args){
		
		boolean done = false;
		int howManyNumbers, i = 0, number, sum = 0;
		double average;
		Scanner keyboard = new Scanner(System.in);
		
		while (!done)
		{
			try
			{
				System.out.println("How many numbers do you want to enter?");
				howManyNumbers = keyboard.nextInt();
				
				if (howManyNumbers < 0)
					throw new Exception("Number must be greater than 0.");
				else
				{
					if (howManyNumbers == 0)
					{
						System.out.println("The average is 0");
						done = true;
					}
					else
					{
						while (i < howManyNumbers)
						{
							System.out.println("Enter number " + (i+1));
							number = keyboard.nextInt();
							i++;
							sum = sum + number;
						}
						average = (double) sum/howManyNumbers;
						System.out.println("The average is " + average);
						done = true;
					}
				}
			}
			catch (Exception e)
			{
				String message = e.getMessage();
				System.out.println(message);
			}
		}
		keyboard.close();
	}
}
