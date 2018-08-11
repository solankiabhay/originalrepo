/* author: Abhaysingh Solanki
 *Date   : 8/8/18
 *Motive : Understand the magic behind programming
 
 */


package xyz;

import java.util.Scanner;


public class PerfectNumber {
//method for find perfect number e.g. 6 divided by 1+2+3=6 perfect no
	public static void perfect(int no)
	{
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("Given number "+no  +"is perfect");
		}
		else {
			System.out.println("Given Input number is not perfect");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("\n Enter the Number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		PerfectNumber.perfect(no);
		
	}
	
}
