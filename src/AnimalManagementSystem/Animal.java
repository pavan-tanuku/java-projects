package AnimalManagementSystem;

public class Animal {
    private String name;
    private byte age;

    public Animal() {
    }

    public Animal(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("The Animal is barking!");
    }

    public void display() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}