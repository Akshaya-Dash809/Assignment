package Lab_01_Nov;
import java.util.Scanner;

public class DuplicateArray //main class
{
	public static void main(String[] args) //main method
	{
		int arr[]= {54,87,98,64,54,32,98,64};//taking the array
		System.out.println("The duplicate no is : ");
		for (int i=0;i<arr.length;i++) {//loop for initializing the array elements
		for(int j=i+1;j<arr.length;j++) {//loop to compare the other elements of the array
			if(arr[i]==arr[j]) //if the same element is found
			
				System.out.println(arr[i]);
			
			
		}
	}
}}