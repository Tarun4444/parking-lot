
package com.example.parkinglot;

import java.util.concurrent.locks.ReentrantLock;

public class ParkingSpot {
    
    private final String id;
    private Vehicle vehicle;
    private final ReentrantLock lock = new ReentrantLock();
    
    public ParkingSpot(String id){ this.id=id; }
    
    public boolean assignVehicle(Vehicle v){
        lock.lock();
        try {
            if(vehicle != null) 
                return false;
            vehicle = v;
            return true;
        } finally { lock.unlock(); }
    }
    
    public void removeVehicle(){
        lock.lock();
        try { 
            vehicle = null; 
        } finally { 
            lock.unlock(); 
        }
    }
    
    public String getId(){ return id; }
}
