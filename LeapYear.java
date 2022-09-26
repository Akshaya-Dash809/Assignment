//WAP to check leap-year

import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int n=s.nextInt();  // input a year from user
		if(n%4==0 && n%100==0 && n%400 ==0)  // Logic inside the for-loop to check the year is leap or not
                {
		System.out.println(n+"  is a leap-year");
                }
		else
		System.out.println(n+" is not a leap-year");
	}
       }