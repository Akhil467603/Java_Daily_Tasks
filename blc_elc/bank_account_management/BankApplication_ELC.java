package com.dailytask.blc_elc.bank_account_management;

public class BankApplication_ELC {

	public static void main(String[] args) {
		Bank_BLC b1=new Bank_BLC();
		b1.setAccountnumber(4343254564l);
		b1.setAccountHolderName("MUSHKE AKHIL");
		b1.setBalance(2000);
		b1.setBalance(3000);
		
		
		
		System.out.println("BANK DETAILS");
		System.out.println("Account Number "+b1.getAccountnumber());
		System.out.println("Account Holder Name "+b1.getAccountHolderName());
		System.out.println("Account Balance "+b1.getBalance());
	}

}
