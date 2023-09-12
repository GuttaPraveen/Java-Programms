package string;

public class ConsectiveZerosAndOnes
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Good Night sahithi");
		int a[]=new int[] {1,0,1,1,0,1};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			/*for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;
				else
					break;
					
			
					
			}*/
			if(a[i]==a[i+1])
			{
				count++;
			}
			max=Math.max(max, count);
		}
		System.out.println(max);

	}

}
/*
 		
 		Input: n = [1,1,0,1,1,1]
		Output: 3
		
		Input: nums = [1,0,1,1,0,1]
		Output: 2
*/