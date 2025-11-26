package Entities;

import Exceptions.QuantityExceptions;

public class Product {	
	
	private String name; 
	private Integer quantity; 
	private Double price; 
	
	public Product(){
	}

	public Product(String name, Integer quantity, Double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public void add(Integer amount) throws QuantityExceptions {
		if(amount < 0) {
			throw new QuantityExceptions("The amount must be positive");
		}
		
		this.quantity += amount;
	}
	
	
}
