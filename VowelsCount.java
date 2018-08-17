/* author: Abhaysingh Solanki
 *Date   : 17/8/18
 *Motive : Understand the magic behind programming
 */


package xyz;

import java.util.Scanner;

public class VowelsCount {

	// method for count vowels
	public static void countvo(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Count of vowels in String is  "+count);
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		VowelsCount.countvo(str); // call the method
		
		
	}

}
