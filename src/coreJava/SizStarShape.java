package coreJava;

public class SizStarShape
{

	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			for(int k=5;k>=1;k--)
			{
				for(int l=1;l<k;l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	
	}
}
