package com.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Bank_")
	public class Bank {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int customerNo;
		private long accountNo;
		private String name;
		private String password;
		private double amount;
		private String address;
		private long mobileNo;
		@Column(name = "deposit")
		private double deposit;

		 
		 private double withdraw;
		 private double transfer;
		 private boolean account_status;
		 private long transfer_account_info;
		public Bank() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Bank(int customerNo ,long accountNo, String name, String password, double amount, String address, long mobileNo,
				double deposit, double withdraw, double transfer, boolean account_status, long transfer_account_info) {
			super();
			this.customerNo=customerNo;
			this.accountNo = accountNo;
			this.name = name;
			this.password = password;
			this.amount = amount;
			this.address = address;
			this.mobileNo = mobileNo;
			this.deposit = deposit;
			this.withdraw = withdraw;
			this.transfer = transfer;
			this.account_status = account_status;
			this.transfer_account_info = transfer_account_info;
		}
		
		public int getCustomerNo() {
			return customerNo;
		}
		public void setCustomerNo(int customerNo) {
			this.customerNo = customerNo;
		}
		public long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public double getDeposit() {
			return deposit;
		}
		public void setDeposit(double deposit) {
			this.deposit = deposit;
		}
		
		public double getWithdraw() {
			return withdraw;
		}
		public void setWithdraw(double withdraw) {
			this.withdraw = withdraw;
		}
		public double getTransfer() {
			return transfer;
		}
		public void setTransfer(double transfer) {
			this.transfer = transfer;
		}
		public boolean isAccount_status() {
			return account_status;
		}
		public void setAccount_status(boolean account_status) {
			this.account_status = account_status;
		}
		public long getTransfer_account_info() {
			return transfer_account_info;
		}
		public void setTransfer_account_info(long transfer_account_info) {
			this.transfer_account_info = transfer_account_info;
		}
		@Override
		public String toString() {
			return "Customer [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", amount=" + amount
					+ ", address=" + address + ", mobileNo=" + mobileNo + ", deposit=" + deposit + ", withdraw="
					+ withdraw + ", transfer=" + transfer + ", account_status=" + account_status
					+ ", transfer_account_info=" + transfer_account_info + "]";
		}
		
	}
