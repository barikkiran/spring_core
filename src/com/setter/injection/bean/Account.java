package com.setter.injection.bean;

/**
 * @author User
 *
 */
public class Account {

	private String id;
	private String accountHolderName;
	private String ifscCode;
	private Double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
		
		System.out.println("0-param constructor executes in "+this.getClass().getSimpleName());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountHolderName=" + accountHolderName + ", ifscCode=" + ifscCode
				+ ", balance=" + balance + "]";
	}

}
