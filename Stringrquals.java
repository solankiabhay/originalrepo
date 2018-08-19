/* author: Abhaysingh Solanki
 *Date   : 19/8/18
 *Motive : Understand the magic behind programming
 */


package xyz;

public class Stringrquals {

	public static void main(String[] args) {

		String s1="abhay";
		String s2=new String("abhay");
		// comparison basis on reference variable
		System.out.println(s1==s2); //false
		//comparison basis on content of String
		System.out.println(s1.equals(s2)); //true
		// s1==s2 return 0
		//s1>s2 return 1
		//s1<s2 return -1
		System.out.println(s1.compareTo(s2)); // 0
		
	}

}
