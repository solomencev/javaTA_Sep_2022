package OOP_Tasks;

public abstract class Animal {
    protected String name;
    protected String sound;
    protected int foot;
    protected int wings;
    protected boolean isUnderwater;
    private boolean isHungry;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getFoot() {
        return this.foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public int getWings() {
        return this.wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public boolean isUnderwater() {
        return this.isUnderwater;
    }

    public void setUnderwater(boolean underwater) {
        isUnderwater = underwater;
    }

    public boolean isHungry() {
        return this.isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void makeSound() {
        System.out.println(this.getName() + " says " + this.getSound());
    }

    public void feed(){
        if(this.isHungry() == true) {
            System.out.println(this.getName() + " ate");
            this.setHungry(false);
        } else System.out.println(this.getName() + " does not want to eat");
    }

    public void showInfo(){
        System.out.println("Name " + this.getName());
        System.out.println("Sound " + this.getSound());
        System.out.println("Foot " + this.getFoot());
        System.out.println("Wings " + this.getWings());
        System.out.println("Is underwater? " + this.isUnderwater());
        System.out.println("Is hungry? " + this.isHungry());
    }
}
