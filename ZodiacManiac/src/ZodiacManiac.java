import java.util.Scanner;

public class ZodiacManiac {
	public static void main (String[] args){
		System.out.println("Welcome to Zodiac Maniac. Enter your information below to find out your Eastern and Western Zodiac Information.");
		Scanner sc = new Scanner(System.in);

		//reference # of days in each month
		int[] bmonth = {31,28,31,30,31,30,31,31,31,30,31,30,31};

		int bmon=-1, bday=-1, year=-1; boolean leapy=false;

		//while loop for birth year
		while(year<1) {
			System.out.println("Enter your birth year: ");

			//keep looping until input is integer
			do{
				//check for if user input is integer
				try {
					//assign user input to syear
					String syear = sc.next();
					//attempt to convert string to int
					year=Integer.parseInt(syear);
				}
				catch(Exception e) {
					//if input isn't integer, ask for new input
					System.out.print("You have typed in a wrong character. Please type in an Integer. \r\n");
				}
			}
			//if byear isn't valid, prompt for new input
			while(year==-1);

			if(year<1){
				System.out.println("Error. Please enter a valid year.\r\n");
			}
		}

		//check if year is leap year
		if((year%4==0) && (year%100!=0)||(year%400==0)){
			leapy=true;
		}

		//if year is leap year, February will have 29 days
		if(leapy==true) {
			bmonth[1]=29;
		}

		//while loop for birth month
		while(bmon>12||bmon<1) {	
			System.out.println("Enter your birth month as an integer (Ex: July would be 07): ");

			//keep looping until input is integer
			do{
				//check for if user input is integer
				try {
					//assign user input to string sbmon
					String sbmon = sc.next();
					//attempt to convert string to int
					bmon=Integer.parseInt(sbmon);
				}
				catch(Exception e) {
					//if input isn't integer, ask for new input
					System.out.print("Enter your birth month as an integer (Ex: July would be 07):");
				}
			}
			while(bmon==-1);

			//if bmon isn't valid, prompt for new input
			if(bmon>12||bmon<1) {
				System.out.println("Error. Please reenter with a valid integer.\r\n");
			}
		}

		//while loop for birth date
		while(bmonth[bmon-1]<bday||bday<1) {
			System.out.println("Enter your birth date: ");

			//keep looping until input is integer
			do{
				//check for if user input is integer
				try {
					//assign user input to string sbday
					String sbday = sc.next();
					//attempt to convert string to int
					bday=Integer.parseInt(sbday);
				}
				catch(Exception e) {
					//if input isn't integer, ask for new input
					System.out.print("You have input a wrong value. Please type a two digit integer. \r\n");
				}
			}
			while(bday==-1);

			//if bday isn't valid, prompt for new input
			if(bmonth[bmon-1]<bday||bday<1) {
				System.out.println("Error. Please reenter with a valid integer.\r\n");
			}
		}
	//creates a new object to call western zodiac
	wZodiac west = new wZodiac();
	//creates a new object to call eastern zodiac
	eZodiac east = new eZodiac();
	//uses object to call westZod function and prints out designated western zodiac
	System.out.println("Your western Zodiac: " + west.westZod(bday, bmon));
	//inserts empty line
	System.out.println();
	//sets the year
	east.setYear(year);
	//uses object to call eastZod function and prints out designated eastern zodiac
	System.out.println("Your eastern Zodiac: ");
 	east.eZod();
	}//end of main class
}//end of ZodiacManiac class
