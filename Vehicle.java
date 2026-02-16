package Vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double cost;
    private double mileage;

    // Constructor
    public Vehicle(String brand, String model, int year, double cost, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cost = cost;
        this.mileage = mileage;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getCost() { return cost; }
    public double getMileage() { return mileage; }

    // Display method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        System.out.println("Cost: ₹" + cost + ", Mileage: " + mileage + " km/l");
    }
}