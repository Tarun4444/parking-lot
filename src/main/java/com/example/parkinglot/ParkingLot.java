
package com.example.parkinglot;

import java.util.List;

public class ParkingLot {
    
    private final List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) { 
        this.floors = floors; 
    } 
    
    public ParkingTicket park(Vehicle vehicle){
        for(ParkingFloor f: floors){
            for(ParkingSpot s: f.getSpots()){
                if(s.assignVehicle(vehicle)){
                    return new ParkingTicket();
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }
}
