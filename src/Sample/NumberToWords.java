package Sample;
import java.util.*;
public class NumberToWords
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=12345;
		int k=(int)Math.log10(n);
		while(k>=0)
		{
			int coe=n/(int)Math.pow(10,k);
			switch(coe)
			{
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("one");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.print("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				default:
					System.out.println("Invalid");
			}
			n=n-(int)Math.pow(10,k)*coe;
			k--;
		}
	}
}
