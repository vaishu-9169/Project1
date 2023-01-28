package com.natwest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="current")
public class CurrentAccount {

	
	
	
	@Id
	private String accountno;
	private String customerno;
	private String accountname;
	private Double balance;
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getCustomerno() {
		return customerno;
	}
	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentAccount(String accountno, String customerno, String accountname, Double balance) {
		super();
		this.accountno = accountno;
		this.customerno = customerno;
		this.accountname = accountname;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "CurrentAccount [accountno=" + accountno + ", customerno=" + customerno + ", accountname=" + accountname
				+ ", balance=" + balance + "]";
	}
	
	
	

}



	
	