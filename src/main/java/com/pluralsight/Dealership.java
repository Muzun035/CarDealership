package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>(); // Initialize inventory
    }

    // Getter methods for dealership details
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    // Add a vehicle to the inventory
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // Return all vehicles
    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory);
    }

    // Search stubs
    public List<Vehicle> getVehiclesByPrice(double min, double max) { return null; }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) { return null; }
    public List<Vehicle> getVehiclesByYear(int min, int max) { return null; }
    public List<Vehicle> getVehiclesByColor(String color) { return null; }
    public List<Vehicle> getVehiclesByMileage(int min, int max) { return null; }
    public List<Vehicle> getVehiclesByType(String vehicleType) { return null; }

    // Stub for removeVehicle method
    public void removeVehicle(Vehicle vehicle) {}
}
