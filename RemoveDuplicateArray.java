/* author: Abhaysingh Solanki
 *Date   : 8/8/18
 *Motive : Understand the magic behind programming
 
 */



package interviewall;

import java.util.Scanner;

public class RemoveDuplicateArray {

	public static void remove(int a[])
	{
		int length=a.length;
		int temp;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]==a[j])
				{
					temp=a[j];
					a[j]=a[length-1];
					a[length-1]=temp;
					length--;
				}
			}
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("\n Enter the number off Element");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
       System.out.println("\n Enter the array element");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
       // call the method
       RemoveDuplicateArray.remove(a);
       
       
       
	}

}
