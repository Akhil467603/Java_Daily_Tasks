package com.dailytask.problem_solving;

class Account {
	long AccountNumber;
	String AccountHolderName;
	double AccountBalance;

	Account(long AccountNumber, String AccountHolderName, double AccountBalance) {
this.AccountNumber=AccountNumber;
this.AccountHolderName=AccountHolderName;
this.AccountBalance=AccountBalance;

if(this.AccountBalance < 1000)
    System.out.println("Minimum Balance of 1,000/-, Deposit: "+(1000 - this.AccountBalance)+" Now");
}

public void deposit(double AccountBalance) {
this.AccountBalance = this.AccountBalance + AccountBalance;
}

public void withdraw(double amount) {
System.out.println("Withdrawing Amount: "+amount);
if(this.AccountBalance < amount)
    System.out.println("Insufficient Amount,  Available Balance: "+this.AccountBalance);
else
    this.AccountBalance -= amount;
}

public void account() {
System.out.println("Account Number: "+AccountNumber);
System.out.println("Account Holder Name: "+AccountHolderName);
System.out.println("Available Balance: "+AccountBalance);
}
}

public class Bank_account_management_system {

	public static void main(String[] args) {
		Account ac = new Account(9999999999L, "AKHIL", 500);

        ac.deposit(400);
        ac.account();
        ac.withdraw(1100);

	}

}
