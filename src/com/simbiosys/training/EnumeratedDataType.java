package com.simbiosys.training;

public class EnumeratedDataType {

	public static void main(String[] args) {
		CoffeeSize cs = CoffeeSize.VENTI;
		System.out.println(cs.getGrade());

	}
	
	enum CoffeeSize {
		SMALL(8), GRANDE(10), VENTI(16) {
			
			//Constant-specific Class Body
			public String getGrade() {
				return "B";
			}
		};
		private int ounces;
		
		private CoffeeSize (int oun) {
			ounces = oun;
		}
		
		public int getOunce() {
			return ounces;
		}
		
		public String getGrade() {
			return "A";
		}
	}
}
