package Lab_12_Dec;
//bank operation program using Deque Array

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class Bank {
	long accountNo;
	String customerName;
	double balance;
	int customerAge;

	public Bank(long acNo, String cName, double b, int ca) {
		this.accountNo = acNo;
		this.customerName = cName;
		this.balance = b;
		this.customerAge = ca;
	}

}

public class BankOperation {

	public static void main(String[] args) {
		Bank b = new Bank(12345, "AKD", 5000.57, 20);
		Bank b1 = new Bank(12346, "Soumya", 6000.58, 21);
		Bank b2 = new Bank(12347, "Nisha", 7000.59, 22);
		Bank b3 = new Bank(12348, "Avishek", 8000.55, 23);
		Bank b4 = new Bank(12349, "Misbah", 9000.56, 24);
		Bank b5 = new Bank(12350, "Shifa", 4000.55, 25);
		Deque<Bank> dq = new ArrayDeque<Bank>();

		dq.add(b);
		dq.add(b1);
		dq.add(b2);
		dq.add(b3);
		dq.add(b4);
		dq.add(b5);

		Iterator itr = dq.iterator();
		while (itr.hasNext()) {
			Bank obj = (Bank) itr.next();
			System.out.println(obj.accountNo + " " + obj.customerName + " " + obj.balance + " " + obj.customerAge);
		}

	}

}