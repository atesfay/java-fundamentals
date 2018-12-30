package com.incubatecode.collections;

public class App {
	
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Saratoga 14", 20, 20);
		
		if (theatre.reserveSeat("H11")){
			System.out.println("Please Pay");
		} else {
			System.out.println("Sorry, the seat is taken!");
		}
		
		if (theatre.reserveSeat("H11")){
			System.out.println("Please Pay");
		} else {
			System.out.println("Soory, the seat is taken!");
		}
	}

}
