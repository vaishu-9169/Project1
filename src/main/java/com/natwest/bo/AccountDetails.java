package com.natwest.bo;

public class AccountDetails {

	public String savingsAccountNo;
	public String currentAccountNo;
	public Double savingsAccountBalance;
	public Double currentAccountBalance;
	public String getSavingsAccountNo() {
		return savingsAccountNo;
	}
	public void setSavingsAccountNo(String savingsAccountNo) {
		this.savingsAccountNo = savingsAccountNo;
	}
	public String getCurrentAccountNo() {
		return currentAccountNo;
	}
	public void setCurrentAccountNo(String currentAccountNo) {
		this.currentAccountNo = currentAccountNo;
	}
	public Double getSavingsAccountBalance() {
		return savingsAccountBalance;
	}
	public void setSavingsAccountBalance(Double savingsAccountBalance) {
		this.savingsAccountBalance = savingsAccountBalance;
	}
	public Double getCurrentAccountBalance() {
		return currentAccountBalance;
	}
	public void setCurrentAccountBalance(Double currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}
	public AccountDetails(String savingsAccountNo, String currentAccountNo, Double savingsAccountBalance,
			Double currentAccountBalance) {
		super();
		this.savingsAccountNo = savingsAccountNo;
		this.currentAccountNo = currentAccountNo;
		this.savingsAccountBalance = savingsAccountBalance;
		this.currentAccountBalance = currentAccountBalance;
	}
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountDetails [savingsAccountNo=" + savingsAccountNo + ", currentAccountNo=" + currentAccountNo
				+ ", savingsAccountBalance=" + savingsAccountBalance + ", currentAccountBalance="
				+ currentAccountBalance + "]";
	}
	
	
}
