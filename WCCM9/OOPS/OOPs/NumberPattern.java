package OOPs;

public class NumberPattern {

	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i<=8;i++)
		{
			if(i%2!=0)
			{
				for(int j = 1; j<=5;j++)
				{
					count++;
					System.out.print(count+ " ");
				}
			}
			else
			{
				int temp = count+1;
				for(int j =count+5;j>=temp;j--)
				{
					count++;
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	

	}

}
