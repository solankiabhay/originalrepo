/* author: Abhaysingh Solanki
 *Date   : 11/8/18
 *Motive : Understand the magic behind programming
 
 */
package xyz;

import java.util.Scanner;

public class StringPalindromOne {

	
	// Method for palindrom String i,e if reverse and original is equal then palindrom else not
	public static boolean Palindrom(String str)
	{
		if(str==null)
		{
			return false;
		}
		StringBuilder sbil=new StringBuilder(str);
		sbil.reverse();
		return sbil.toString().equals(str);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("palindrom of the given string is");
		boolean c=StringPalindromOne.Palindrom(str); //call the method 
		System.out.println(c);// for printing purpose
		
		
	}

}
