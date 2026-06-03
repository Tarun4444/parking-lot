
package com.example.parkinglot;

import java.util.UUID;

public class ParkingTicket {
    private final String id = UUID.randomUUID().toString();
    public String getId(){ return id; }
}
