package com.hibernate.chapter2;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	private int customerId;
	private String customerName;
	
	private CustomerDetails custDetails;

	@Id
	@GeneratedValue
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Embedded
	public CustomerDetails getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(CustomerDetails custDetails) {
		this.custDetails = custDetails;
	}
	
	
}
