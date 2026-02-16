package Vehicle;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, double cost, double mileage, int doors) {
        super(brand, model, year, cost, mileage);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
