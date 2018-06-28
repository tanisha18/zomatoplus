package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_items")
public class Item implements Serializable{
	@Id
	@GeneratedValue
	@Column(name ="item_id")
	
	private Long id;
	
	@Column(name ="restaurant_id")
	private String restaurant_id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="price")
	private Double price;
	
	@Column(name ="description")
	private String description;
	
	public Item() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(String restaurant_id) {
		this.restaurant_id = restaurant_id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Item(Long id, String restaurant_id, String name, Double price, String description) {
		super();
		this.id = id;
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	
	
	
	
	
}

