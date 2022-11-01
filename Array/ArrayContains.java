package Lab_01_Nov;
import java.util.Scanner;
public class ArrayContains {

	public static void main(String args[]) //main method
	{
		int n,i;
		int a[]=new int[5];
		for(i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers: "); //input 5 numbers
			a[i]=sc.nextInt();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find: "); //input a number to find
		n=sc.nextInt();
		for(i=0;i<5;i++)
		if(n==a[i]) //checking if the  number input'n' is equal to the numbers given'a[i]
		{
			System.out.println(n+" Found at Position: "+(i+1)); //printing the position of the number
		}
	}
}