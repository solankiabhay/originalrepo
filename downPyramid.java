/* author: Abhaysingh Solanki
 *Date   : 13/8/18
 *Motive : Understand the magic behind programming
 
 */


package xyz;

public class downPyramid {

	
public static void main(String[] args) {

	int space=1;
	int stars=5;
	for(int i=1;i<=5;i++)
	{
		System.out.println();
		
		for(int s=0;s<=space;s++)
		{
			System.out.print(" ");
		}
		space++;
		for(int j=1;j<=stars;j++)
		{
			System.out.print("* ");
		}
		stars--;
	}
	
	}

}
