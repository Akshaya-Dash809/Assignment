package Lab_17Oct;

import java.util.Scanner;

/*.Write a java program to illustrate Calculator class with addition, subtraction,
multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading*/
public class Calculator {
	public int addition(int...add) {//using varargs method
		int sum=0;
		for(int i:add) {//using foreach loop
			sum=sum+i;
		}
		return sum;
	}
	public int subtraction(int...sub) {//using varargs method
		int min=0;
		for(int i:sub) {//using foreach loop
			min=i-min;
		}
		return min;
	}
	public int multiplication(int...mul) {//using varargs method
		int m=1;
		for(int i:mul) {//using foreach loop
			m=m*i;
		}
		return m;
	}
	public static void main(String[] args) {//main method
		Calculator obj=new Calculator();//creating object of calculator class
		int r1=obj.addition(12,34,67,89);
		int r2=obj.subtraction(12,56);
		int r3=obj.multiplication(12,34,67);
		System.out.println("Addition "+r1);
		System.out.println("Subtraction "+r2);
		System.out.println("Multiplication "+r3);}}