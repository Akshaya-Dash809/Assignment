//WAP to find factorial of any number

import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
	
	{
	
            long n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("Enter number");
	   
            n=sc.nextLong(); //input a number from user
 
	    for(int i=1;i<=n;i++) // logic for find factorial
	    {
	
	    fact=fact*i;
 
 	    }
 
  	    System.out.println("The factorial of the given number is : "+fact);
 
	}
 
}