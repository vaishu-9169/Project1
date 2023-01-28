package com.natwest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accountdetails")
public class Accounts {

	
	@Id
	private String savingsaccountno;
	private String currentaccountno;
	private Double currentbalance;
	private Double savingsbalance;
	public String getSavingsaccountno() {
		return savingsaccountno;
	}
	public void setSavingsaccountno(String savingsaccountno) {
		this.savingsaccountno = savingsaccountno;
	}
	public String getCurrentaccountno() {
		return currentaccountno;
	}
	public void setCurrentaccountno(String currentaccountno) {
		this.currentaccountno = currentaccountno;
	}
	public Double getCurrentbalance() {
		return currentbalance;
	}
	public void setCurrentbalance(Double currentbalance) {
		this.currentbalance = currentbalance;
	}
	public Double getSavingsbalance() {
		return savingsbalance;
	}
	public void setSavingsbalance(Double savingsbalance) {
		this.savingsbalance = savingsbalance;
	}
	public Accounts(String savingsaccountno, String currentaccountno, Double currentbalance,
			Double savingsbalance) {
		super();
		this.savingsaccountno = savingsaccountno;
		this.currentaccountno = currentaccountno;
		this.currentbalance = currentbalance;
		this.savingsbalance = savingsbalance;
	}
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SavingsAccount [savingsaccountno=" + savingsaccountno + ", currentaccountno=" + currentaccountno
				+ ", currentbalance=" + currentbalance + ", savingsbalance=" + savingsbalance + "]";
	}
	
	

}



	
	