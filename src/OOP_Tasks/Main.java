package OOP_Tasks;

public class Main {
    public static void main(String[] args) {
        Animal animal = createAnimal();
        animal.showInfo();
        animal.feed();
        animal.makeSound();
//        Cat cat = new Cat();
//        cat.makeSound();
//        cat.showInfo();
//        cat.feed();
//        cat.showInfo();
//        cat.feed();
//
//        Hippopotamus hippopotamus = new Hippopotamus();
//        hippopotamus.feed();
//        hippopotamus.feed();
//        hippopotamus.makeSound();
//        hippopotamus.showInfo();
//
//        Parrot parrot = new Parrot();
//        parrot.fly();
//        parrot.makeSound();
//        parrot.feed();
//        parrot.showInfo();
    }
    public static Animal createAnimal(){
        if(Math.random() <= 0.4){
            Animal cat = new Cat();
            System.out.println("Cat is created");
            return cat;
        } else if (Math.random() <= 0.7) {
            Animal hippopotamus = new Hippopotamus();
            System.out.println("Hippopotamus is created");
            return hippopotamus;
        } else {
            Animal parrot = new Parrot();
            System.out.println("Parrot is created");
            return parrot;
        }
    }
}
