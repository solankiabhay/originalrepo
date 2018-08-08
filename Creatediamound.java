/* author: Abhaysingh Solanki
 *Date   : 8/8/18
 *Motive : Understand the magic behind programming
 
 */


package interviewall;

public class Creatediamound {

public static void main(String[] args) {
int star=1;
int space=4;		
for(int i=1;i<=5;i++)		
{
	System.out.println(); //Each time control goes on new line
	
	for(int s=1;s<=space;s++)
	{
		System.out.print(" ");
	}
	space--;
	
	for(int j=1;j<=star;j++)
	{
		if(j==1||j==star)
		{
		System.out.print("* "); // while true print star
	     }
		else {
			System.out.print("  "); //while condition false print space
		}
	}
	star++;
	
}   // Upper shape
	int stardown=4;
	int spacedown=1;
for(int i=1;i<=4;i++)
{
	System.out.println();// Each time next line
	
	for(int s=1;s<=spacedown;s++)
	{
		System.out.print(" ");
	}
	spacedown++;
	for(int j=1;j<=stardown;j++)
	{
		if(j==1||j==stardown)
		{
			System.out.print("* ");  //while true print star
		}
		else {
			System.out.print("  "); // while false print space
		     }
	}
	stardown--;
}  // completed down-star-shape



	}
}
