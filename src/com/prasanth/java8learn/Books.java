package com.prasanth.java8learn;

public class Books {

	private int id;
	private String name;
	private float cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	/**
	 * @param id
	 * @param name
	 * @param cost
	 */
	public Books(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	/**
	 * 
	 */
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
}
