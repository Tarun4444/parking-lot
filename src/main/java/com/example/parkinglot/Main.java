
package com.example.parkinglot;

import java.util.*;

public class Main {
    public static void main(String[] args){
        
        ParkingSpot s1 = new ParkingSpot("S1");
        ParkingFloor floor = new ParkingFloor(Arrays.asList(s1));
        ParkingLot lot = new ParkingLot(Arrays.asList(floor));
        ParkingTicket t = lot.park(new Car("KA01AB1234"));
        
        System.out.println(t.getId());
    }
}
