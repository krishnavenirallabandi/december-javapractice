package com.hdfc.loans.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();
		
		

	}

	@Override
	public void withdrawl() {
		System.out.println("I am overridden withdrawl in Icici");
		
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overridden deposit in Icici");
		
	
		
	}

}
