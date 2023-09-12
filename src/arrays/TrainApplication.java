package arrays;

import java.util.Scanner;

public class TrainApplication
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String tName[]=new String[] {"Ajanta Express","Gitanjali Express","Shatabdi Express","Vande Bharat Express","Vivek Express","Double Decker Express","Ahimsa Express","Rajdhani Express"};
		String srcLoc[]=new String[] {"Hyderabad","Bengaluru","Vijayawada","Vishakapatnam","Chennai","Kerala","Warngal","Gujarat","Kolkata"};
		String desLoc[]=new String[] {"Vijayawada","Kolkata","Kerala","bengaluru","Hyderabad","Vishakapatnam","Warngal","Gujarat","Chennai"};
		int price[]=new int[] {300,400,500,350,550,450,600,250,700};
		int berth[]=new int[] {2,4,6,4,5,3,1,5,3};
		System.out.println("\tWelcome To Railway System");
		System.out.println("1.Display\n2.Insertion\n3.Deletion");
		System.out.print("Please Choose a Number: ");
		int n=sc.nextInt();
		switch(n)
		{
			
			case 1:
				System.out.println("\t---------------------------------------------------------------------------------");
				System.out.printf("\t |%s\t |%s\t |%s\t |%s\t |%s\t |%n","Train Name","Source Location","Destination Location","Price","Berth");
				//System.out.println("\t-------------------------------------------------------------------------------------------------");
				System.out.println("\t---------------------------------------------------------------------------------");
	
				for(int i=0;i<tName.length;i++)
				{
					
					System.out.printf("\t|%s\t |%s\t |%s\t |%s\t |%s\t |%n",tName[i],srcLoc[i],desLoc[i],price[i],berth[i]);
					//System.out.println("\t----------------------------------------------------------------------------------------------");
					System.out.println("\t---------------------------------------------------------------------------------");
				}
				break;
			case 2:
				
		
		}
		
		
		

	}

}
