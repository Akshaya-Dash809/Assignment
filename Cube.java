/*Q.2..Write a program in Java to display the cube of the number
 upto given an integer..
*/

  package Lab_21Oct;

  import java.util.Scanner;
  public class Cube {
	public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = sc.nextInt();  //number from user input
			for(int i=1; i<=num; i++){  //for loop to print the cube upto number
			    System.out.println("The cube of " + i + " is " + i*i*i);// print the cube upto number
			}
		}
	}


