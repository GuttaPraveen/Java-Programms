package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensional
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n and m values: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();			}
		}
		System.out.println(Arrays.deepToString(a));
		//Left and Right Diagonal in matrix
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j)
					System.out.print(a[i][j]+" ");
				if(i==0 && j==m-1 || i==n-1 && j==0) // if(i+j==m-1)
					System.out.print(a[i][j]+" ");
				else
					System.out.print(" ");
				
	
			}
			System.out.println();
		}
		//Transpose of matrix
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println(Arrays.deepToString(b));
		

	}

}
