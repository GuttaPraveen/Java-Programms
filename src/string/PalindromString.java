package string;
import java.util.*;
public class PalindromString
{
	static int s,len=0;
    public static String longestPalindrome(String A)
    {
        int n = A.length();
        for(int i = 0;i<n;i++)
        {
            help(A,i,i+1,n);
            help(A,i,i,n);
        }
        //System.out.println(s+" "+len);
        return A.substring(s,s+len);
    }
    public static void help(String A,int i,int j,int n)
    {
        while(i>=0 && j<n && A.charAt(i) == A.charAt(j))
        {
            i--;
            j++;
        }
        if(len<j-i-1)
        {
            s = i+1;
            len = j-i-1;
            
        }
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="CwaFMiTTfSQQmCRPhtthKJAbOWPyoOp";
		System.out.println(longestPalindrome(s));
	}

}
