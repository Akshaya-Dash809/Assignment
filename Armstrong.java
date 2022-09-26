// WAP to check Armstrong Number

import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Put a Number  ");
	
	        int a=scn.nextInt(); // input from user
		int r;
		int sum=0;
		int temp=a; // Here temp is a temperary variable 

		for (;a>0 ; ) // Logic in for loop to check the no. is Armstrong or not
		{
			r=a%10;  //reminder
			sum=sum +(r*r*r);
			a=a/10;
		}
		if(temp==sum)  // To check the given no. is equal to the sum of qube of that no.
		{
			System.out.println("The given no "+temp+"  is an armstorng");  //if equal
		}
		else{
			System.out.println("The given no "+temp+"  is not an armstorng"); // if not equal
		}
	}
}
