/* Author: Abhaysingh Solanki
 *Title  :PrimeNumberUptoRange
 *Date   : 8/8/18
 *Motive : Understand the magic behind programming
  */



package interviewall;

public class PrimeUptorange {

public static void main(String[] args) {
String primrNumbers="";  // initially prime number is Empty String	
for(int i=1;i<=100;i++)  // you can put any limit or range
{  
	 int cnt=0;                     //initially count is 0
	for(int j=i;j>=1;j--)
	{
		if(i%j==0)    // number is divided by no itself or we can say that one
		{
			cnt=cnt+1;
		}
	}
		
	if(cnt==2)
	{
		primrNumbers=primrNumbers+i+" ";
	}
}
	System.out.println("Primenumber upto 100 is ");
	System.out.print(primrNumbers);
		
	}
	
}
