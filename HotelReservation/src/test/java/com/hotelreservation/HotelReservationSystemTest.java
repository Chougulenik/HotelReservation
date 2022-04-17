package com.hotelreservation;

import org.junit.Test;

import junit.framework.Assert;

public class HotelReservationSystemTest {

	@Test
    public void givenHotelNamesWhenAddedShouldReturnSize() {
        HotelReservationSystem obj = new HotelReservationSystem();
        obj.addHotel();
        Assert.assertEquals(3, obj.hotelReservation.size());
    }
}
