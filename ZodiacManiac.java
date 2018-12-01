//Maria’s part of ZodiacManiac
import java.util.Scanner;

public class ZodiacManiac {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthday: ");
		int bday = sc.nextInt();
		System.out.println("Enter your birthmonth: ");
		int bmon = sc.nextInt();
		System.out.println("Enter your birthyear: ");
		int year = sc.nextInt();
		ZodiacManiacWest west = new ZodiacManiacWest();
		eZodiac east = new eZodiac();
		System.out.println("Your western Zodiac: " + west.westZod(bday, bmon));
		System.out.println();
		System.out.println("Your eastern Zodiac: " );
		east.eZod(year);
	}//end of main class
}//end of ZodiacManiac class
//end of Maria’s part
