package com.hibernate.chapter2;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerDetails {

	private String customerAddress;
	private String customerRating;
	private String customerRewards;
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerRating() {
		return customerRating;
	}
	public void setCustomerRating(String customerRating) {
		this.customerRating = customerRating;
	}
	public String getCustomerRewards() {
		return customerRewards;
	}
	public void setCustomerRewards(String customerRewards) {
		this.customerRewards = customerRewards;
	}
	
	
}
