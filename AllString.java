/* author: Abhaysingh Solanki
 *Date   : 8/8/18
 *Motive : Understand the magic behind programming
 
 */
package xyz;

import java.util.Scanner;

public class AllString {

	// Count the occurence of character in the String
	public static void countcharacter(String str,char character)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==character)
			{
				count++;
			}
		}
		System.out.println("Occurence of character    "   +character+ "   is "+count);
	}
	
	//Convert the String to Lower-case to Upper-case and vice versa.
	public static void loupUplow(String str)
	{
		char ch;
		String s=""; 
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			if(ch>=65 && ch<=90)
			{
				s+=(char)(ch+32);
			}
			else if(ch>=97 && ch<=122)
			{
				s+=(char)(ch-32);
			}
			else
			{
				s+=ch;
			}
		}
		System.out.println("Case conversion of character Accounding ASCII ");
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the character");
		char character=sc.next().charAt(0);
		AllString.countcharacter(str, character); //count occurence method call
		AllString.loupUplow(str); //Lower to upper and so on method call
	}
	
}
