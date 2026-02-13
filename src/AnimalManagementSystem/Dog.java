package AnimalManagementSystem;

public class Dog extends Animal {
    private String breed;
    private String color;

    public Dog(String name, byte age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("The Dog is barking!");
    }
    @Override
    public void display() {
        System.out.println("The name of the Dog is: " + getName());
        System.out.println("The breed of the Dog is: " + getBreed());
        System.out.println("The age of the Dog is: " + getAge());
        System.out.println("The color of the Dog is:" + getColor());
    }

}