package com.natwest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer1")
public class Customer {

	
	
	private String firstname;
	private String lastname;
	
	@Id
	private String email;
	private String address;
	private String phone;
	private String account;
	private String password;
	private String confirmpassword;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", account=" + account + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getEmail()=" + getEmail() + ", getAddress()=" + getAddress() + ", getPhone()="
				+ getPhone() + ", getAccount()=" + getAccount() + ", getPassword()=" + getPassword()
				+ ", getConfirmpassword()=" + getConfirmpassword() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
