/* author: Abhaysingh Solanki
 *Date   : 15/8/18
 *Motive : Understand the magic behind programming
 
 */


package xyz;
//simple reverse array by using swapping
public class ReverseArray {
  public static void main(String[] args) {
     int a[]={1,2,3,4,5};
     for(int aa:a)
     {
    	 System.out.println(aa);
     }
    int start=0;
     int end=a.length-1;
     int temp=0;
     
     while(start<end)
     {
      temp=a[start];	 
      a[start]=a[end];
      a[end]=temp;
    	 start++;
    	 end--;
     }
     System.out.println("After reverse");
    for(int mm:a) 
    {
    	System.out.println(mm);
    }
	}

}
