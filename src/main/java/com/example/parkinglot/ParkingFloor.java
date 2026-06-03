
package com.example.parkinglot;

import java.util.List;

public class ParkingFloor {
    
    private final List<ParkingSpot> spots;

    public ParkingFloor(List<ParkingSpot> spots){ this.spots=spots; }
    
    public List<ParkingSpot> getSpots(){ return spots; }
}
