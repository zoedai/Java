package com.simbiosys.training.grocery;

public abstract class PackageFood extends Grocery {

	public PackageFood(int price) {
		super(price);
	}

	public String getType() {
		return "Package Type";
	}
}
