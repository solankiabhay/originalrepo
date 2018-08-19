/* author: Abhaysingh Solanki
 *Date   : 19/8/18
 *Motive : Understand the magic behind programming
 */



package xyz;


// return the interned String. If the String created by using new keyword it creates yje exact copy of the String


public class InternString {

	public static void main(String[] args) {
		String s2="radhika";
		String s1=new String("radhika");
		String s3=s1.intern();
		System.out.println(s3);
System.out.println(s1==s2);  //false

System.out.println(s2==s3);//true
	}

}
