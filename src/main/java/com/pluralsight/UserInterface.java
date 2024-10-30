package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        init();
    }

    // Initializes the dealership by loading from the file
    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }

    // Display the main menu
    public void display() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            displayMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": processGetAllVehiclesRequest(); break;
                case "2": running = false; break; // Quit
                // Additional cases for other options will go here in Phase 5
                default: System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    // Menu helper method
    private void displayMenu() {
        System.out.println("\nCar Dealership Application");
        System.out.println("1. List all vehicles");
        System.out.println("2. Quit");
        System.out.print("Enter your choice: ");
    }

    // Displays all vehicles in the dealership
    private void processGetAllVehiclesRequest() {
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    // Helper method to display a list of vehicles
    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.printf("VIN: %d, Year: %d, Make: %s, Model: %s, Type: %s, Color: %s, Odometer: %d, Price: $%.2f%n",
                    vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(),
                    vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice());
        }
    }
}
