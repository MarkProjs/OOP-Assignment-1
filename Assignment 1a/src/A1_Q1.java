//----------------------------------------------
//Assignment 1

//Written by: Mark Benedict Agluba, 40294956
//For COMP 248 Section S - Fall 2024
//----------------------------------------------

/*This program is being used to calculate both the Daily Energy and the Annual Energy depending on the user's input
 * on the number of solar panels, wattage rating per panel, number of sunlight hours per day and the efficiency of the
 * solar panel.
 * The program will then show the Daily Energy and the Annual Energy*/


import java.util.Scanner;

class A1_Q1 {

	public static void main(String[] args) {
		//initializing the Scanner class
		Scanner input = new Scanner(System.in);
		
		//The start of the program
		//Welcoming message
		System.out.println("********* Solar Energy Calculator *********");
		
		//prompt for the user to enter the number of solar panel
		System.out.print("Enter the number of solar panels: ");
		int numPanels = input.nextInt();
		
		//prompt for the user to enter the wattage rating for each solar panel
		System.out.print("Enter the wattage rating of each solar panel (in watts): ");
		int panelWattage = input.nextInt();
		
		//prompt for the user to enter the average number of sunlight per day
		System.out.print("Enter the average number of sunlight hours per day: ");
		double sunlightHours = input.nextDouble();
		
		//prompt for the user to enter the efficiency of the solar panels
		System.out.print("Enter the efficiency of the solar panels (as a percentage): ");
		double efficiency = input.nextDouble();
		
		input.close();
		//blank space
		System.out.println();
		
		//displaying the Daily Energy Production
		double dailyEnergy = calculateDailyEnergy(numPanels, panelWattage, sunlightHours, efficiency);
		System.out.println("Daily Energy Production: " + String.format("%.4f", dailyEnergy) + " kWh");
		
		//displaying the Annual Energy Production
		double annualEnergy = calculateAnnualEnergy(dailyEnergy);
		System.out.println("Annual Energy Production: "+ String.format("%.4f", annualEnergy) +"kWh");
		
		System.out.println("Thank you for using the Solar Energy Calculator!");
		
		
		

	}
	
	//method to use to calculate the Daily Energy based on the inputs
	private static double calculateDailyEnergy(int numPanels, int panelWattage, double sunlightHours, double efficiency) {
		double numerator, denominator;
		numerator = numPanels * panelWattage * sunlightHours * efficiency;
		denominator = 1000 * 100;
		return numerator / denominator;
	}
	
	//method to use to calculate the Annual based on the daily energy input
	private static double calculateAnnualEnergy(double dailyEnergy) {
		return dailyEnergy * 365;
	}

}
