package arrays;

import java.util.Scanner;

public class MatrixDiagonalSum
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			sum+=a[i][i];
		}
		System.out.println(sum);
		for(int i=0;i<r;i++)
		{
			if(i!=c-1-i)
				sum+=a[i][c-1-i];
		}
		System.out.println(sum);

	}

}
