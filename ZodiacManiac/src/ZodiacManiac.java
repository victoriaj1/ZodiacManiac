import java.util.Scanner;

public class ZodiacManiac {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] bmonth = {31,28,31,30,31,30,31,31,31,30,31,30,31};
		char q1;int bmon, bday, year; boolean leapy=false;
		
		do {
		System.out.println("Enter your birth year: ");
		year = sc.nextInt();
		if(year%4!=0) {
			if(year%100==0) {
				if(year%400!=0) {
					leapy=true;
				}
			}
		}
			if(leapy==true) {
			bmonth[1]=29;
			}
			if(year<1900){
			System.out.println("Please reenter with a valid integer.");
			}
		}
		while(year<1900);
		
		
		do{
		System.out.println("Enter your birth month: ");
		bmon = sc.nextInt();
			if(bmon>12||bmon<1) {
			System.out.println("Please reenter with a valid integer.");
			}
		}
		while(bmon>12||bmon<1);
		bmon = sc.nextInt();
		
		do {
		System.out.println("Enter your birth date: ");
		bday = sc.nextInt();
			if(bmonth[bmon-1]<bday||bday<1) {
				System.out.println("Please reenter with a valid integer.");
			}
		}
		while(bmonth[bmon-1]<bday||bday<1);
		
		
		
		ZodiacManiacWest west = new ZodiacManiacWest();
		eZodiac east = new eZodiac();
		System.out.println("Your western Zodiac: " + west.westZod(bday, bmon));
		System.out.println();
		System.out.println("Your eastern Zodiac: " );
		east.eZod(year);
	}//end of main class
}//end of ZodiacManiac class
