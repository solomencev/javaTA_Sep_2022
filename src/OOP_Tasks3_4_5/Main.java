package OOP_Tasks3_4_5;

public class Main {
    public static void main(String[] args) {
        Animal animal = createAnimal();
        animal.showInfo();
        animal.feed();
        animal.makeSound();

        Dog dog = new Dog("Lucky");
        dog.run();
        System.out.println(Dog.Stat.counter);

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

class Dog {
    private String name = "";
    private Foot foot = new Foot();
    private int id = -1;

    {
        name = "";
        Stat.counter++;
        id = ++Stat.id;
    }

    Dog(){

    }

    Dog(String name) {
        this.name = name;
    }

    void run(){
        foot.run();
    }

    class Foot{
        void run(){
            System.out.println("Dog " + name + " is running");
        }
    }

    static class Stat {
        public static int counter = 0;
        public static int id = 0;
    }
}