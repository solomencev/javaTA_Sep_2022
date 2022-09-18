package hometask_3_4;

public class Car {
    String color;
    String gear;

}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.gear = "auto";
        System.out.println(car1.color + " " + car1.gear);
    }
}