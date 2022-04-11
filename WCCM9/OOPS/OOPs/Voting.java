package OOPs;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Your Age : ");
		age= sc.nextInt();
		
		try {
		if (age<18)
		{
			throw new ThrowsKeyword("You are not eligible For Voting");
		}
		else {
			System.out.println("You are eligible for Voting");	
		}
		}
		catch(ThrowsKeyword e)
		{
			e.printStackTrace();
		}
		System.out.println("Thanks");
	}
}
