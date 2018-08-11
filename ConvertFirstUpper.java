/* author: Abhaysingh Solanki
 *Date   : 8/8/18
 *Motive : Understand the magic behind programming
 
 */


package xyz;

import java.util.Scanner;

public class ConvertFirstUpper {

	// method to create first letter to upper
	public static void FirstToUpper(String str)
	{
	     String upper=""; // to store the value	
	     char ch;
	     for(int i=0;i<str.length();i++)
	     {
	    	 ch=str.charAt(i);
	    	 if((i==0 && str.charAt(i)!=' ')||(str.charAt(i)!=' ' && str.charAt(i-1)==' '))
	    	 {
	    		 if(ch>=97 && ch<=122)
	    		 {
	    			 upper+=(char)(ch-32);
	    		 }
	    	 }
	    	 else {
				upper+=ch; //Else given as it is
			}
	    	 
	    	 
	     }
	     System.out.println("Coversion of first letter of String as uppercase");
	     System.out.println(upper);
	}
	
	
	
	public static void main(String[] args) {
  System.out.println("\n Enter the String");
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  ConvertFirstUpper.FirstToUpper(str);
		
	}

}
