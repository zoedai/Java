package com.simbiosys.training.grocery;

public abstract class Grocery {
	public enum Color {
		RED, GREEN, OTHER;
	}
	
	private  double pricePerItem;
	private  double weight;
	private  Color color;
	
	public Grocery(double price) {
		pricePerItem = price;
	}
	
	public  double getPrice(int num) {
		return num * pricePerItem;
	}
	
	public  double getPricePerItem() {
		return pricePerItem;
	}

	public  void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}

	public  double getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
