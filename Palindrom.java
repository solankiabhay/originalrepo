/* author: Abhaysingh Solanki
 *Date   : 13/8/18
 *Motive : Understand the magic behind programming
 
 */


package xyz;

import java.util.Scanner;

public class Palindrom {

	//method for palindrom number
	
	//e.g 123 reverse 321 if 123!=321 not palindrom 121=121 palindrom
	
	
public static void	palindronum(int no)
{
	int rev=0;
	int num=no;
	System.out.println(num);
	while(no!=0)
	{
	int	rem=no%10;
	rev=rev*10+rem;
	no=no/10;		
	}
	
if(num==rev)
{
	System.out.println("Given   "+num  + "  is palindrom number");
}
else {
	System.out.println("Given   "+num   + "  NOT palindrom number");
}
	
}  //first method ends here

// Method for checking String is palindrom
public static void stringpalindrom(String str)
{
	String pal=str;
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev+=str.charAt(i);
	}
	if(rev.equals(pal))
	{
		System.out.println("Given String  "+pal+ "  is palindrom String");
	}
	else {
		System.out.println("Given String  "+pal+ "  is NOT palindrom String");
	}
	
}
	
	
	public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc=new Scanner(System.in); 
    int no=sc.nextInt();  // Accept number from user
    System.out.println("Enter the String");
    Scanner st=new Scanner(System.in);
    String str=st.nextLine();   //Accept String from user
    
    
    Palindrom.palindronum(no);  //call the  number method
    Palindrom.stringpalindrom(str); // call the String method
	}

}
