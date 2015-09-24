package com.simbiosys.training.grocery;

public class MyGroceryApplication {

	public static void main(String[] args) {
		Apple apple = new Apple();
		Cabbage cabbage = new Cabbage();
		Icecream icecream = new Icecream();
		Pizza pizza = new Pizza();
		
		for (int i = 0; i < 2; i++) {
			System.out.println((i == 0 ? "First" : "Second") + " Calculation");
			System.out.println("Price for 2 apples and 3 cabbages is : "
					+ (apple.getPrice(2) + cabbage.getPrice(3)));

			
			System.out.println(apple.getPrice(3) + icecream.getPrice(4)
					< cabbage.getPrice(5) + pizza.getPrice(3));
			
			if (i == 0) {
				apple.setColor(Grocery.Color.GREEN);
				apple.setPricePerItem(6);
				System.out.println();
			}

		}
		
	}

}
