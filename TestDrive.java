package Oops;

class Car {
	// Instance variables
	String make;
	String model;
	int year;

	// Constructor to initialize instance variables
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Method to display car information
	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
}

public class  TestDrive {
	public static void main(String[] args) {
		// Create two car objects with their own set of instance variables
		Car car1 = new Car("Toyota", "Camry", 2022);
		Car car2 = new Car("Honda", "Civic", 2021);

		// Display information about each car
		System.out.println("Car 1:");
		car1.displayInfo();

		System.out.println("\nCar 2:");
		car2.displayInfo();
	}
}


