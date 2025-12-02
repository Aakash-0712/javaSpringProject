package com.example.SpringNestedJson;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table					
public class OrderEntity {

	@Id
	@GeneratedValue
	private int order_id;
	@Column
	private String order_name;
	@ManyToOne
	@JoinColumn(name="cust_id")
	private CustomerEntity customerentity;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public CustomerEntity getCustomerentity() {
		return customerentity;
	}
	public void setCustomerentity(CustomerEntity customerentity) {
		this.customerentity = customerentity;
	}
	
}
