package com.hibernate.compoundkey;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {

	CompoundKey compkey;
	private int accountBalance;
	@Embedded
	@Id
	public CompoundKey getCompkey() {
		return compkey;
	}
	public void setCompkey(CompoundKey compkey) {
		this.compkey = compkey;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}