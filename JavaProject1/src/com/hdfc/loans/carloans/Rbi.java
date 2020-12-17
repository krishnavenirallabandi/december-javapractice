package com.hdfc.loans.carloans;

public interface Rbi {
	//Hiding the implementation details 
	void withdrawl();
	void deposit();
	public static void main(String[] args) {
		Rbi r1=new Icici();
		r1.deposit();
		r1.withdrawl();
		Rbi r2=new Hdfc();
		r2.deposit();
		r2.withdrawl();
		
		
	}
	
}


