package Vehicle;

public class Bike extends Vehicle {
    private String type;

    public Bike(String brand, String model, int year, double cost, double mileage, String type) {
        super(brand, model, year, cost, mileage);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}