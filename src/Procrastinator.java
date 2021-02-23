import java.util.Scanner;

public class Procrastinator {

	public static void main(String[] args) {
		
		System.out.println("How many days in advance do you typically finish a coding assignment?");
		System.out.println("Your options are 7 days, 5 days, 2 days, or 1 day");
		
		Scanner myScanner = new Scanner(System.in);
		
		int userChoice = myScanner.nextInt();
		
		if (userChoice == 7) {
			
			System.out.println("Wow! You are a great student for getting your work done so early.");
		}
		
		else if (userChoice == 5) {
			
			System.out.println("Nice! You finish your assignments really early in advance!");
		}
		
		else if (userChoice == 2) {
			
			System.out.println("Hey you should probably start doing your assignments earlier.");
		}
		
		else {
			
			System.out.println("You really need to start doing you assignments earlier or you aren't going to succeed in school.");
		}
	}
}
