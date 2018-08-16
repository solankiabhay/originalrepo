/* author: Abhaysingh Solanki
 *Date   : 16/8/18
 *Motive : Understand the magic behind programming
 
 */
package xyz;

import java.util.Scanner;

public class CountString {

//method for count total no of character in given String
public static void countchar(String str)
{

int count=0;
for(int i=0;i<str.length();i++)
{
 if(str.charAt(i)!=' ')
 {
	 count++;
 }
}
System.out.println("Total number of character");
System.out.println(count);
}
	
// method for count the word in String
public static void countword(String str)
{
	String[] ch=str.split(" ");
	
	
	System.out.println("number of words in Given String");
	System.out.println(ch.length);
	
}


	public static void main(String[] args) {

// Accept the string from user		
System.out.println("\n Enter the String");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
CountString.countchar(str); //call the total no of char method

CountString.countword(str); // call the nethod for count words
		
		
		
	}

}
