package AnimalManagementSystem;

public class Cow extends Animal {
    private boolean hasHorns;
    private boolean giveMilk;

    public Cow(String name, byte age, boolean hasHorns, boolean giveMilk) {
        super(name, age);
        this.hasHorns = hasHorns;
        this.giveMilk = giveMilk;
    }

    public boolean getHasHorns() {
        return hasHorns;
    }
    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    public boolean isGiveMilk() {
        return giveMilk;
    }

    public void setGiveMilk(boolean giveMilk) {
        this.giveMilk = giveMilk;
    }
    @Override
    public void display() {
        System.out.println("The name of the Cow is " + getName() + " and it is " + getAge() + " years old");
        System.out.println("Does it gave milk today " + isGiveMilk() + ". Does it has horns " + getHasHorns() + ".");
    }
}