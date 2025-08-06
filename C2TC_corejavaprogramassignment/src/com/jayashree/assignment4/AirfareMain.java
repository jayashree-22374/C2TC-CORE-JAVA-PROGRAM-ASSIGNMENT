package com.jayashree.assignment4;

import java.util.Scanner;

public class AirfareMain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int choice = Integer.parseInt(scanner.nextLine().trim());
	        int hours = Integer.parseInt(scanner.nextLine().trim());
	        double costPerHour = Double.parseDouble(scanner.nextLine().trim());

	        Airfare airfare;

	        switch (choice) {
	            case 1:
	                airfare = new AirIndia(hours, costPerHour);
	                break;
	            case 2:
	                airfare = new KingFisher(hours, costPerHour);
	                break;
	            case 3:
	                airfare = new Indigo(hours, costPerHour);
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                scanner.close();
	                return;
	        }

	        airfare.display();
	        scanner.close();
	    }


}
