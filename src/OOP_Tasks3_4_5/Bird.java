package OOP_Tasks3_4_5;

public abstract class Bird extends Animal implements Flyable{
    protected final int wings = 2;
    public void fly(){
        System.out.println(this.name + " is flying");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Wings " + this.wings);
    }
}
