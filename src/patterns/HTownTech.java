package patterns;
import java.util.*;
public class HTownTech {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2==0)
                {
                    if(i>=n+1-j)
                        System.out.print("*");
                    else
                        System.out.print("#");
                }
                else
                {
                    if(i>=j) 
                        System.out.print("*");
                    else
                        System.out.print("#");
                }
            }
            System.out.println();
        }
        for(int i=n/2+1;i<=n;i++)
        {
            
            if(i%2==0)
            {
                for(int j=1;j<=n;j++)
                {
                    if(j>=i)
                        System.out.print("*");
                    else
                        System.out.print("#");
                }
            }
            else
            {
                for(int j=1;j<=n;j++)
                {
                    if(i<=n+1-j)
                        System.out.print("*");
                    else
                        System.out.print("#");
                        
                }
            }
            System.out.println();
        }

	}

}
/*
  n=8	*#######
		######**
		***#####
		####****
		****####
		#####***
		**######
		#######*
		
 n=5	*####
		###**
 		***##
		###**
 		*####
		
		
		

 */
