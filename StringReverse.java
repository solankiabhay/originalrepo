/* author: Abhaysingh Solanki
 *Date   : 11/8/18
 *Motive : Understand the magic behind programming
 
 */

package xyz;

import java.util.Scanner;

public class StringReverse {

	//method one for reverse String
	public static void reversebymethod(String str)
	{
		StringBuffer br=new StringBuffer(str);
		System.out.println("Revers of String is");
		System.out.println(br.reverse());
	}
	
	//Reverse by using simple way
	public static void simplereverse(String str)
	{
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
		s+=str.charAt(i);
		}
		System.out.println("Simpleway reverse of String is");
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
     
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringReverse.reversebymethod(str);
		StringReverse.simplereverse(str);
	}

}
