package hometask_3_4;

public class Car {
    Car(){
        System.out.println("Car is created");
    }
    String color;
    String gear;
    String manufacturer;
    double mileage;
    int doors;
    int speed;

    int increaseSpeed (int pace) {
        speed+=pace;
        return  speed;
    }

    int slowDown (int pace) {
        speed-=pace;
        return speed;
    }

    void showInfo(){
        System.out.println("Mazda 3 has the following parameters: " + "color: " + color + "; gear: " + gear
                + "; manufacturer: " + manufacturer + "; mileage: " + mileage + "; doors: " + doors + " current speed: " + speed);
    }

}

class CarTest {
    public static void main(String[] args) {
        Car mazda3 = new Car();
       mazda3.color = "white";
       mazda3.doors = 5;
       mazda3.mileage = 100000;
       mazda3.gear = "manual";
       mazda3.manufacturer = "Mazda";
       mazda3.speed = 90;
       mazda3.showInfo();
       mazda3.increaseSpeed(10);
       mazda3.showInfo();
       mazda3.slowDown(100);
       mazda3.showInfo();

    }
}