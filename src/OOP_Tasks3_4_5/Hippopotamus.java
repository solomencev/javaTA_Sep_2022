package OOP_Tasks3_4_5;

public class Hippopotamus extends Mammal{
    public Hippopotamus (){
        this.name = "Hippopotamus";
        this.sound = "Mu-uu";
        this.foot = 4;
        this.isUnderwater = true;
        this.setHungry(true);
    }

    public void feed(){
       System.out.println(this.name + " ate"); // Hippopotamus always wants to eat
    }
}
