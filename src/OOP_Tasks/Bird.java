package OOP_Tasks;

public abstract class Bird extends Animal implements Flyable{
    public void fly(){
        System.out.println(this.name + " is flying");
    }
}
