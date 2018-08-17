/* author: Abhaysingh Solanki
 *Date   : 17/8/18
 *Motive : Understand the magic behind programming
 */



package xyz;

import java.util.Scanner;

public class FindmiddlebasisSum {

	//method to find middle index on basis of left and right sum
	
	public static int findindex(int arr[]) throws Exception
	{
		int leftsum=0;
		int rightsum=0;
		int startIndex=0;
		int endIndex=arr.length-1;
		while(true)
		{
			if(leftsum>rightsum)
			{
				rightsum+=arr[endIndex--];
			}
			else
			{
				leftsum+=arr[startIndex++];
			}
			if(startIndex>endIndex){
				if(leftsum==rightsum)
				{
					break;
				}
				else {
					throw new Exception("Please pass proper value");
				}
				
				
			}
		}
		return endIndex;
		
	}
	
	public static void main(String[] args)  {

	System.out.println("Enter the no of array");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	
	int arr[]=new int[no];
	System.out.println("Enter the array element");
      for(int i=0;i<arr.length;i++)
        {
	      arr[i]=sc.nextInt();
        }
		
      // call the method
      try {
	System.out.println("Find the middle index basis of sum is  "+FindmiddlebasisSum.findindex(arr));//find the middle index
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
