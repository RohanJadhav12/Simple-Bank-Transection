import java.util.Scanner;

 

public class Minipro
{

  public static void main(String[] args) {

	Scanner input = new Scanner(System.in);	System.out.print("Savings Account balance: ");

	double savings = input.nextDouble();

	System.out.print("Current Account balance: ");

	double current = input.nextDouble();

	

	if (savings < 1 || current < 1) {

	    System.out.println("Balances must be greater than 0.");

	    input.close();

	    return;

	}

	System.out.print("Choose an operation: 1) Deposit, 2) Withdraw, 3) Transfer: ");

	int operation_choice = input.nextInt();

 

	if (operation_choice == 1) {

	    System.out.print("To 1) Savings, 2) Current ?: ");

	    int account_choice = input.nextInt();

	    if (account_choice == 1) {

		System.out.print("Amount: ");

		double amount = input.nextDouble();

		savings += amount;

	    }

	    else if (account_choice == 2) {

		System.out.print("Amount: ");

		double amount = input.nextDouble();

		current += amount;

	    }

	    else {

		System.out.print("Unknown account number.");

		input.close();

		return;

	    }

	}

	else if (operation_choice == 2) {

	    System.out.print("From 1) Savings Account, 2) Current Account ?: ");

	    int account_choice = input.nextInt();

	    if (account_choice == 1) {

		System.out.print("Amount: ");

		double amount = input.nextDouble();

		if (savings - amount < 0) {

		    System.out.println("Withdraw amount exceeds savings balance.");

		    input.close();

		    return;

		}

		savings -= amount;

	    }

	    else if (account_choice == 2) {

		System.out.print("Amount: ");

		double amount = input.nextDouble();

		if (savings - amount < 0) {

		    System.out.println("Withdraw amount exceeds savings balance.");

		    input.close();

		    return;

		}

		current -= amount;

	    }

	    else {

		System.out.print("Unknown account number.");

		input.close();

		return;

	    }

	}

	else if (operation_choice == 3) {

	    System.out.print("From 1) Savings Account, 2) Current Account: ");

	    int from_choice = input.nextInt();

	    System.out.print("To 1) Savings Account, 2) Current Account: ");

	    int to_choice = input.nextInt();

 

	    if (from_choice == to_choice) {

		System.out.println("Same account to transfer from and to");

		input.close();

		return;

	    }

	    else if (from_choice == 1) {

		System.out.print("Amount: ");

		double amount = input.nextDouble();

		if (savings - amount < 0) {

		    System.out.print("Transfer amount exceeds balance");

		    input.close();

		    return;

		}

		savings -= amount;

		current += amount;

	    }

	    else if (from_choice == 2) {

		System.out.print("Amount: ");

		double amount = input.nextDouble();

		if (current - amount < 0) {

		    System.out.print("Transfer amount exceeds balance");

		    input.close();

		    return;

		}

		current -= amount;

		savings += amount;

	    }

	    else {

		System.out.println("Unknown accounts chosen");

		input.close();

		return;

	    }

	}

	else {

	    System.out.println("Invalid operation choice");

	    input.close();

	    return;

	}

	input.close();

	System.out.println("Savings Account balance: " + savings);

	System.out.println("Current Account balance: " + current);

    }

}