package com.simbiosys.training.grocery;

import com.simbiosys.training.grocery.Grocery.Color;

public class Pizza extends PackageFood {

	public Pizza() {
		super(3);
		this.setColor(Color.OTHER);

	}
	
	public String getType() {
		return "Pizza";
	}

}
