package OOPs;

import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Your Age : ");
		int voting =sc.nextInt();
	 
		try {
			if (voting<18) {
				throw new CustomExceptions("You are Not eligible for Voting");
			}
			else {
				System.out.println("Thanks For Voting");
			}
		}
		catch(CustomExceptions c)
		{
			c.printStackTrace();
		}
 
	}

}
