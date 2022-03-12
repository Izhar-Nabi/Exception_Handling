package VotingManagement;
import java.util.Scanner;
public class Voting {
	public static void main(String [] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age= input.nextInt();
		try {
		if(age<18) {
			throw new AgeChecker("You are not able to Vote");
		}
		else {
			System.out.println("you are able to vote");
		}
		}
		catch(Exception e) {
			e.printStackTrace();}
	System.out.println("Program work normallly");
	}
}
