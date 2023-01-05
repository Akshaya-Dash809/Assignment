package com.bms;

import java.sql.SQLException;
import java.util.Scanner;

import com.loader.CloseAcc;
import com.loader.DepBal;
import com.loader.OpenAcc;
import com.loader.PinChange;
import com.loader.ShowBal;
import com.loader.WithBal;
public class BankingManagementSys {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		int var;
		do {
			System.out.println("""
					->||   Welcome to BANKING SERVICE  ||<-

					Press 1 to open Account in Our Bank :~
					Press 2 to Show Account Details :~
					Press 3 to Deposit to Account in Our Bank :~
					Press 4 to Withdrawal from Account  :~
					Press 5 to Change your pin  :~
					Press 6 to Close Account in Our Bank :~
					Press 7 to  Exit :~

					""");
			var = sc.nextInt();
			System.out.println("______");
			switch (var) {
			case 1:
				System.out.println("Enter 10 Digit to create a new acc. Number: ");
				int acc_no = sc.nextInt();
				System.out.println("Enter IFSC code: ");
				String ifsc = sc.next();
				System.out.println("Enter 4 digit to create a new acc pin");
				int pin = sc.nextInt();
				OpenAcc op = new OpenAcc();
				op.openAccountDetails(acc_no, ifsc, pin);
				System.err.println("_NEW ACC CREATED_");
				break;
			case 2:
				System.out.println("Enter your acc no: ");
				int p = sc.nextInt();
				System.out.println("Enter your pin: ");
				int q = sc.nextInt();
				ShowBal sb = new ShowBal();
				sb.fetchAccountDetails(p, q);
				System.out.println();
				break;
			case 3:
				System.out.println("Enter your acc no: ");
				int a = sc.nextInt();
				System.out.println("Enter your pin: ");
				int b = sc.nextInt();
				DepBal db = new DepBal();
				db.deposit(a, b);
				System.out.println();
				break;
			case 4:
				System.out.println("Enter your acc no: ");
				int c = sc.nextInt();
				System.out.println("Enter your pin: ");
				int d = sc.nextInt();
				WithBal wb = new WithBal();
				wb.withdrawal(c, d);
				System.out.println();
				break;
			case 5:
				System.out.println("Enter your acc no: ");
				int e = sc.nextInt();
				System.out.println("Enter your current pin: ");
				int f = sc.nextInt();
				PinChange pc = new PinChange();
				pc.pinChange(e, f);
				System.err.println("_PIN HAS BEEN CHANGED__");
				break;
			case 6:
				System.out.println("Enter your acc no: ");
				int g = sc.nextInt();
				System.out.println("Enter your current pin: ");
				int h = sc.nextInt();
				CloseAcc ca = new CloseAcc();
				ca.deleteAcc(g,h);
				System.out.println();
				break;
			case 7:
				System.err.println("You have sucessfully logged out");
				System.out.println("__THANK YOU__");
				System.out.println();
				System.exit(0);
				break;

			}
		} while (var > 0 && var < 8);

	}

}
