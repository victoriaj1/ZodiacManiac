import java.util.Scanner;

public class ZodiacManiac {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		//reference # of days in each month
		int[] bmonth = {31,28,31,30,31,30,31,31,31,30,31,30,31};
		
		int bmon=0, bday=0, year=0; boolean leapy=false;

		//while loop for birth year
		while(year<1) {
			System.out.println("Enter your birth year: ");

			//keep looping until input is integer
			do{
				//check for if user input is integer
				try {
					//assign user input to syear
					String syear = sc.next();
					//locate integer in syear
					year=Integer.parseInt(syear);
				}
				catch(Exception e) {
					//if input isn't integer, ask for new input
					System.out.print("Type an Integer");
				}
			}
			while(year==0);
			
			//check if year is leap year
			if((year%4==0) && (year%100!=0)||(year%400==0)){
				leapy=true;
			}
			
			//if year is leap year, February will have 29 days
			if(leapy==true) {
				bmonth[1]=29;
			}
			
			//if bday isn't valid, prompt for new input
			if(year<1){
				System.out.println("Please reenter with a valid integer.");
			}
		}

		//while loop for birth month
		while(bmon>12||bmon<1) {	
			System.out.println("Enter your birth month: ");

			 //keep looping until input is integer
			do{
				//check for if user input is integer
				try {
					//assign user input to string sbmon
					String sbmon = sc.next();
					//find integer in sbmon
					bmon=Integer.parseInt(sbmon);
				}
				catch(Exception e) {
					 //if input isn't integer, ask for new input
					System.out.print("Type an Integer");
				}
			}
			while(bmon==0);
			
			//if bmon isn't valid, prompt for new input
			if(bmon>12||bmon<1) {
				System.out.println("Please reenter with a valid integer.");
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
					 //find integer in sbday
					bday=Integer.parseInt(sbday);
				}
				catch(Exception e) {
					//if input isn't integer, ask for new input
					System.out.print("Type an Integer");
				}
			}
			while(bday==0);
			
			//if bday isn't valid, prompt for new input
			if(bmonth[bmon-1]<bday||bday<1) {
				System.out.println("Please reenter with a valid integer.");
			}
		}

		wZodiac west = new wZodiac();
		eZodiac east = new eZodiac();
		System.out.println("Your western Zodiac: " + west.westZod(bday, bmon));
		System.out.println();
		System.out.println("Your eastern Zodiac: " );
		east.eZod(year);

	}//end of main class
}//end of ZodiacManiac class
