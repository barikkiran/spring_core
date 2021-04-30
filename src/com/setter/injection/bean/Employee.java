package com.setter.injection.bean;

public class Employee {

	private String empId;
	private String empName;
	private String designation;

	private Account account;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		
		System.out.println("0-param constructor executes in "+this.getClass().getSimpleName());
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", account="
				+ account + "]";
	}

}
