package AnimalManagementSystem;

public class Cat extends Animal{
    private String color;

    public Cat(String name, byte age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void display() {
        System.out.println("The name of the cat is: " + getName());
        System.out.println("The age of my cat is \"" + getAge() + "\" and it is in " + getColor() + " color.");
    }
}
