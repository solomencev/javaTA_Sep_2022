package OOP_Tasks;

public abstract class Animal {
    protected String name;
    protected String sound;
    protected int foot;

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
            System.out.println(this.getName() + " is eating");
            this.setHungry(false);
        } else System.out.println(this.getName() + " does not want to eat");
    }

    public void showInfo(){
        System.out.println("Name " + this.getName());
        System.out.println("Sound " + this.getSound());
        System.out.println("Foot " + this.getFoot());
        System.out.println("Is underwater? " + this.isUnderwater());
        System.out.println("Is hungry? " + this.isHungry());
    }
}
