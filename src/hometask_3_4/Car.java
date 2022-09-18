package hometask_3_4;

public class Car {
    String color;
    String gear;
    String manufacturer;
    double mileage;
    int doors;

}

class CarTest {
    public static void main(String[] args) {
        Car mazda3 = new Car();
        mazda3.color = "red";
        mazda3.gear = "auto";
        mazda3.manufacturer = "Mazda";
        mazda3.mileage = 145.567;
        mazda3.doors = 3;
        System.out.println("Mazda 3 has the following parameters: " + "color: " + mazda3.color + "; gear: " + mazda3.gear
        + "; manufacturer: " + mazda3.manufacturer + "; mileage: " + mazda3.mileage + "; doors: " + mazda3.doors);

        Car golf6 = new Car();
        golf6.color = "white";
        golf6.gear = "manual";
        golf6.manufacturer = "Volkswagen";
        golf6.mileage = 170.5;
        golf6.doors = 5;
        System.out.println("Golf 6 has the following parameters: " + "color: " + golf6.color + "; gear: " + golf6.gear
                + "; manufacturer: " + golf6.manufacturer + "; mileage: " + golf6.mileage + "; doors: " + golf6.doors);
    }
}