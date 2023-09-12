package assesment;

import java.util.Scanner;

public class RotateLeft
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Good Morning");
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=Integer.toBinaryString(n);
		System.out.println(s);
		int bit=Integer.bitCount(n);
		System.out.println(bit);
		int rl=Integer.rotateLeft(n, k);
		System.out.println(rl);
		int rr=Integer.rotateRight(n, k);
		System.out.println(rr);
		

	}

}
