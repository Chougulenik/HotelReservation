package com.hotelreservation;

import org.junit.Test;
import org.junit.Assert;


public class HotelReservationSystemTest {

	   @Test
	    public void givenHotelNamesWhenAddedShouldReturnSize() {
	        HotelReservationSystem obj = new HotelReservationSystem();
	        obj.addHotel();
	        Assert.assertEquals(3, obj.hotelReservation.size());
	    }
	    
	    @Test
	    public void givenDateRangeShouldReturnTheCheapestHotelRate() {
	        HotelReservationSystem  obj = new HotelReservationSystem();
	        obj.addHotel();
	        Assert.assertEquals(220, obj.findCheapestHotel("2020-09-10", "2020-09-11"));
	    }
}
