package OOPs;

import java.util.Scanner;

public class Voting2 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Your Age :  ");
		int vote =  sc.nextInt();
		try {
			if(vote<18)
			{
				throw new  CustomExceptions2(); 
			}
			else if(vote>=18 && vote<120)
			{
				System.out.println("Thanks for Voting");
			}
			else if (vote>120) {
				System.out.println("You Are Still Alive?");
			}
		}
		catch(CustomExceptions2 e)
		{
			e.printStackTrace();
		}
		System.out.println("Hello");
		
	}

}
