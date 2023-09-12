package loops;
import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=11121;
        String s=String.valueOf(n);//11121
        int len=s.length();//5
        int i=len-2;//3
        while(i>=0 && s.charAt(i)>=s.charAt(i+1))//3>=0 && 2 >= 1 2>=0 && 1>=2
        {
            i=i-1;//2
        }
        if(i==-1)
            System.out.println(-1);
        int j=len-1;//4
        while(s.charAt(j)<=(s.charAt(i)))//1<=1 2<=1
        {
            j-=1;//3
        }
        char ch[]=s.toCharArray();//[1,1,1,2,1]
        char temp=ch[i];
        ch[i]=ch[j];//[1,1,2,2,1]
        ch[j]=temp;//[1,1,2,1,1]
        String res=String.valueOf(ch[0]);//1
        for(int k=ch.length-1;k>0;k--)
        {
            res+=ch[k];//11211
        }
        int z=Integer.parseInt(res);//11211
        System.out.println(z);
    }
}
