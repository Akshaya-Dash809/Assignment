/*Q.1...Write a Java program that reads in two floating-point 
numbers and tests whether they are the same up to 
three decimal places.
*/

package Lab_21Oct;

import java.util.Scanner;
public class FloatingPoint {

	   
	  public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Input 1st floating-point number: ");
	        float x = in.nextFloat();  //1st user input float number
	        System.out.print("Input 2nd floating-point number: ");
	        float y = in.nextFloat();  //2nd user input float number

	        x = Math.round(x * 1000);  //Using of round method to change the decimal point 
	        x = x / 1000;

	        y = Math.round(y * 1000);
	        y = y / 1000;

	        if (x == y)  //if block to check the no.s same or not
	        {
	            System.out.println("They are the same up to three decimal places");
	        }
	        else
	        {
	            System.out.println("They are different");
	        }
	    }
}
