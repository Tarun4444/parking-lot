
package com.example.parkinglot;

public abstract class Vehicle {
    
    private final String licenseNumber;
    
    public Vehicle(String licenseNumber){ this.licenseNumber=licenseNumber; }

    public String getLicenseNumber(){ return licenseNumber; }
}
