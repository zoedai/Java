package com.simbiosys.training.grocery;



public class Pizza extends PackageFood {

	public Pizza() {
		super(3);
		this.setColor(Color.OTHER);

	}
	
	public String getType() {
		return "Pizza";
	}

}
