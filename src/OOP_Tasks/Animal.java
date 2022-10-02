package OOP_Tasks;

public abstract class Animal {
    String name;
    String sound;
    int foot;
    int wings;
    boolean isUnderwater;
    boolean isHungry;

    public void makeSound() {
        System.out.println(this.name + " says " +this.sound);
    }

    public void feed(){
        if(this.isHungry == true) {
            System.out.println(this.name + " ate");
            this.isHungry = false;
        } else System.out.println(this.name + " does not want to eat");
    }


    public void showInfo(){
        System.out.println("Name " + this.name);
        System.out.println("Sound " + this.sound);
        System.out.println("Foot " + this.foot);
        System.out.println("Wings " + this.wings);
        System.out.println("Is underwater? " + this.isUnderwater);
        System.out.println("Is hungry? " + this.isHungry);
    }
}
