package arrays;
import java.util.Arrays;
public class ArrayPreDefinedMethods {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n[]=new int[]{5,2,8,3,1};
		//Sort The Array
        Arrays.sort(n);
        System.out.println("Sorted Array is:"+Arrays.toString(n));
        //Searching for a Value
        int key=8;
        int index=Arrays.binarySearch(n,key);
        System.out.println("Index of "+key+" in the array is: "+index);
        //Filling the array with Value
        int filledArray[]=new int[5];
        Arrays.fill(filledArray,10);
        System.out.println("Filled Array:"+Arrays.toString(filledArray));
        //Copying a portion Of The Array
        int sourceArray[]=new int[]{1,2,3,4,5};
        int copiedArray[]=Arrays.copyOfRange(sourceArray,0,4);
        System.out.println("Copied Array: "+Arrays.toString(copiedArray));
        //Checking Array Equality
        int a1[]=new int[]{1,2,3};
        int a2[]=new int[]{1,2,3};
        boolean isEqual=Arrays.equals(a1,a2);
        System.out.println("Are Arrays equal? "+isEqual);
        

	}

}
