package Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

          // Cars
        vehicles.add(new Car("Toyota", "Corolla", 2020, 1500000, 18.0, 4));
        vehicles.add(new Car("Honda", "Civic", 2019, 1700000, 16.5, 4));
        vehicles.add(new Car("Hyundai", "Creta", 2021, 1200000, 17.0, 4));
        vehicles.add(new Car("Maruti Suzuki", "Swift", 2022, 800000, 22.0, 4));
        vehicles.add(new Car("Tata", "Harrier", 2023, 1500000, 15.0, 4));

     // Bikes
        vehicles.add(new Bike("Yamaha", "R15", 2022, 160000, 40.0, "Sports"));
        vehicles.add(new Bike("Royal Enfield", "Classic 350", 2021, 190000, 35.0, "Cruiser"));
        vehicles.add(new Bike("Bajaj", "Pulsar 220F", 2020, 130000, 38.0, "Sports"));
        vehicles.add(new Bike("KTM", "Duke 200", 2022, 220000, 32.0, "Sports"));
        vehicles.add(new Bike("Hero", "Splendor Plus", 2023, 75000, 65.0, "Commuter"));

        // Menu-driven system
        while(true) {
            System.out.println("\n--- Vehicle Information System ---");
            System.out.println("1. View All Vehicles");
            System.out.println("2. Search Vehicle");
            System.out.println("3. To display car brands");
            System.out.println("4. To display bike brands");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch(choice) {
                case 1:
                    for(Vehicle v : vehicles) {
                        v.displayInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 2:
                    System.out.print("Enter brand or model to search: ");
                    String keyword = sc.nextLine();
                    boolean found = false;
                    for(Vehicle v : vehicles) {
                        if(v.getBrand().equalsIgnoreCase(keyword) || v.getModel().equalsIgnoreCase(keyword)) {
                            v.displayInfo();
                            System.out.println("-------------------");
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("No vehicle found with keyword: " + keyword);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 4: // List all cars
                    System.out.println("\n--- Car Brands ---");
                    for(Vehicle v : vehicles) {
                        if(v instanceof Car) {
                            System.out.println(v.getBrand() + " - " + v.getModel());
                        }
                    }
                    break;

                 case 5: // List all bikes
                    System.out.println("\n--- Bike Brands ---");
                    for(Vehicle v : vehicles) {
                        if(v instanceof Bike) {
                            System.out.println(v.getBrand() + " - " + v.getModel());
                        }
                    }
                    break;


                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

