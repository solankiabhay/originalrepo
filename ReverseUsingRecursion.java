/* author: Abhaysingh Solanki
 *Date   : 11/8/18
 *Motive : Understand the magic behind programming
 
 */


package xyz;

import java.util.Scanner;

public class ReverseUsingRecursion {

	//Recursion is a process when method called itself
	//method for reverse String using recursion
	public static String recursionrev(String str)
	{
		if((str.length()==0)||(str.length()==1))
		{
			return str;
		}
		else 
			return recursionrev(str.substring(1))+str.charAt(0);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Recursion way reverse is");
		System.out.println(ReverseUsingRecursion.recursionrev(str));//call method and print output
		
	}

}
