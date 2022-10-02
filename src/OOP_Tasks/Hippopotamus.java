package OOP_Tasks;

public class Hippopotamus extends Mammal{
    public Hippopotamus (){
        this.name = "Hippopotamus";
        this.sound = "Mu-uu";
        this.foot = 4;
        this.wings = 0;
        this.isUnderwater = true;
        this.isHungry = true;
    }

    public void feed(){
       System.out.println(this.name + " ate"); // Hippopotamus always wants to eat
    }
}
