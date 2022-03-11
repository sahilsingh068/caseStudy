package com.pizzamanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzalayer") // table name will be pizzalayer
public class Pizza {
	@Id
	private int pizzaNo;
	private String pizzaType;
	private int pizzaPrice;
	private String deliveryAdd;
	public int getPizzaNo() {
		return pizzaNo;
	}
	// Getter & Setters
	public void setPizzaNo(int pizzaNo) {
		this.pizzaNo = pizzaNo;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getDeliveryAdd() {
		return deliveryAdd;
	}
	public void setDeliveryAdd(String deliveryAdd) {
		this.deliveryAdd = deliveryAdd;
	}
	// Default Constructor
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	// Parameterised Constructor
	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		this.deliveryAdd = deliveryAdd;
	}
	// calling toString methods
	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", deliveryAdd=" + deliveryAdd + "]";
	}
	
	

}
