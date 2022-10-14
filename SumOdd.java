//1.write a java program to print sum of odd numbers up to N?

package Lab_14Oct;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //Scanner class for taking input from user
		System.out.print("Enter a number");
		int n=sc.nextInt();
		int sum=0; //initially sum =0
		for(int i=1;i<=n;i+=2) { //for loop to choose the odd nos and add them
			sum+=i; //add the odd nos and assign in sum
		}
		System.out.println("Sum of "+n+" odd numbers= "+sum);
	}

}

