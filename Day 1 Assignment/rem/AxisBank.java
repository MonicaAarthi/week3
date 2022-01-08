package org.rem;

public class AxisBank extends BankInfo {

	public void deposit() {
	
	System.out.println("New Deposit(overridden): Rs.35,000");	
	
	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.saving();
		ab.fixed();
		
		ab.deposit(); // overridden value
	
		// to perform parent function 
		BankInfo bi = new BankInfo();
		bi.deposit(); // parent value
		
	}

}
