package xyz;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
   
		System.out.println("Enter the  number of rows for star Triangle ");
          Scanner sc=new Scanner(System.in);
          int row=sc.nextInt();
   
          
          for(int i=1;i<=row;i++)
          {
        	  System.out.println();
        	  for(int j=i;j>=1;j--)
        	  {
        		  System.out.print("*");
        	  }
          }
          
          
	}

}
