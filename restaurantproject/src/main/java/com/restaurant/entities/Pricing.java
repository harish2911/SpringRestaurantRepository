package com.restaurant.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pricing")
public class Pricing {
			
	@Id
	int restaurant_id;
	float price_per_table;
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public float getPrice_per_table() {
		return price_per_table;
	}
	public void setPrice_per_table(float price_per_table) {
		this.price_per_table = price_per_table;
	}
	@Override
	public String toString() {
		return "Pricing [restaurant_id=" + restaurant_id + ", price_per_table=" + price_per_table + "]";
	}
	public Pricing(int restaurant_id, float price_per_table) {
		super();
		this.restaurant_id = restaurant_id;
		this.price_per_table = price_per_table;
	}
	public Pricing() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}