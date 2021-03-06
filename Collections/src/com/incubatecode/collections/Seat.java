package com.incubatecode.collections;

public class Seat {
	
	private final String seatNumber;
	private boolean reserved = false;
	
	public Seat(String seatNumber) {
	
		this.seatNumber = seatNumber;
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}

	public boolean isReserved() {
		return reserved;
	}

	public boolean reserve(){
		if(!this.reserved){
			this.reserved = true;
			System.out.println("Seat" + seatNumber + "reserved");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean cancelResrvation(){
		if(this.reserved){
			this.reserved = false;
			System.out.println("Resrvation of the seat " + seatNumber + " cancelled!");
			return true;
		} else {
			return false;
		}
	}

}
