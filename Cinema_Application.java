import java.util.Scanner;
public class Cinema_Application 
{
	static Scanner input = new Scanner(System.in);
	static String[] filmList = {"Joker", "Superman", "Spierman","Batman"};
	static String[] times = {"2pm", "4pm", "6pm","8pm",};
	
public static void main(String[] args) 
{
	chooseFilm();
}
		
	public static void chooseFilm()
	{
		
		for(int i=0; i < filmList.length; i++)
		{
			System.out.println("Press " + (i+1) + " for " + filmList[i]);
			
		}
		int choice = input.nextInt();
		String chosenFilm = filmList[choice-1];// move selection into local variable
		
		System.out.println("You have chosen to see " + chosenFilm);
		System.out.println("Choose time");
		
		for(int i=0; i < times.length; i++)
		{
			System.out.println("Press " + (i+1) + " for " + times[i]);
		}
		choice = input.nextInt();
		String chosenTimes = times[choice-1];
		
		System.out.println("You have chosen to watch " + chosenFilm + " at " + chosenTimes);
		
		 chooseTickets(chosenFilm, chosenTimes);
	}
	public static void chooseTickets(String chosenFilm, String chosenTimes)
	{
		System.out.println("You have chosen to watch " + chosenFilm + " at " + chosenTimes);
		System.out.println("Please choose your ticket");
		/*
		 * We want to ask the user to echoose one ticket type ie adult or child 
		 * 2 number of tickets 
		 * 
		 * we need varaibles for the ticket price for adult and child tickets.
		 * 
		 * we need to calc the price and then send transaction price onto payment method
		 * 
		 */
	}

}
