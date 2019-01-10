package com.incubatecode.collections;

import java.util.*;


/*
 * 
 * Created by Abraham on 12/12/2018.
 */

public class Theatre {
	
	private final String theatreName;
	private List<Seat> seats = new ArrayList<>();
	
	public Theatre(String theatreName, int numRows, int seatPerRow) {
		
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows -1);
		for (char row = 'A'; row <= lastRow; row++){
			for (int seatNum = 1; seatNum <= seatPerRow; seatNum++){
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				 seat.add(seat);
			}
		}
		
	}

	public String getTheatreName() {
		return theatreName;
	}	
	
	public boolean reserveSeat(String seatNumber){
		
		
		// = = = = = = = = = =  = = =  = = = = =  = = = = =  = = = =
		// use binary search compare seats
		
		int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
        
		// = = = = = = = = = =  = = =  = = = = =  = = = = =  = = = =
		
//		Seat requestedSeat = null;
//		for (Seat seat: seats){
//			if(seat.getSeatNumber().equals(seatNumber)){
//				requestedSeat = seat;
//				break;
//			}
//		}
//		
//		if (requestedSeat == null){
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		}
//		
//		return requestedSeat.reserve();
        
		// = = = = = = = = = =  = = =  = = = = =  = = = = =  = = = =
	}
	
	// for testing purpose
	public void getSeats(){
		for (Seat seat : seats){
			System.out.println(seat.getSeatNumber());
		}
	}

//	private class Seat {
//		private final String seatNumber;
//		private boolean reserved = false;
//		
//		public Seat(String seatNumber) {
//		
//			this.seatNumber = seatNumber;
//		}
//		
//		public String getSeatNumber() {
//			return seatNumber;
//		}
//
//		public boolean isReserved() {
//			return reserved;
//		}
//
//		public boolean reserve(){
//			if(!this.reserved){
//				this.reserved = true;
//				System.out.println("Seat" + seatNumber + "reserved");
//				return true;
//			} else {
//				return false;
//			}
//		}
//		
//		public boolean cancelResrvation(){
//			if(this.reserved){
//				this.reserved = false;
//				System.out.println("Resrvation of the seat " + seatNumber + " cancelled!");
//				return true;
//			} else {
//				return false;
//			}
//		}
//
////		public void add(Seat seat) {
////			// TODO Auto-generated method stub
////			
////		}
//
//	}

			

}
