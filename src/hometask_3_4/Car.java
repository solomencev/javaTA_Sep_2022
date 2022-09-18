package hometask_3_4;

public class Car {
    Car(){
        System.out.println("Car is created");
    }

    Car(String color1, String gear1, String manufacturer1, double mileage1, int doors1, int speed1){
        color = color1;
        gear = gear1;
        manufacturer = manufacturer1;
        mileage = mileage1;
        doors = doors1;
        speed = speed1;
    }

    Car (String color2, String gear2, String manufacturer2, double mileage2){
        this(color2, gear2, manufacturer2, mileage2, 0, 0);
    }

    Car (double mileage3, int doors3, int speed3){
        this(null, null, null, mileage3, doors3, speed3);
    }

    String color;
    String gear;
    String manufacturer;
    double mileage;
    int doors;
    int speed;

    int increaseSpeed (int pace) {
        speed+=pace;
        System.out.println("Speed is increased on: " + pace);
        return  speed;
    }

    int slowDown (int pace) {
        speed-=pace;
        System.out.println("Speed reduced by: " + pace);
        return speed;
    }

    void showInfo(){
        System.out.println("The create car has the following parameters: " + "color: " + color + "; gear: " + gear
                + "; manufacturer: " + manufacturer + "; mileage: " + mileage + "; doors: " + doors + " current speed: " + speed);
    }

}

class CarTest {
    public static void main(String[] args) {
        Car mazda3 = new Car("white", "automation", "Mazda", 150.000, 5, 90);
        mazda3.showInfo();
        mazda3.increaseSpeed(10);
        mazda3.showInfo();
        mazda3.slowDown(90);
        mazda3.showInfo();



    }
}