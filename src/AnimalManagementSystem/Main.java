package AnimalManagementSystem;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog(
                "Tyson",
                (byte) 3,
                "German Shepard",
                "Brown"
        );
        animals[1] = new Cat(
                "Tom",
                (byte)2,
                "orange"
        );
        animals[2] = new Cow(
                "Lakshmi",
                (byte) 5,
                true,
                true
        );

        for(Animal a: animals) {
            // using instanceof

//            if(a instanceof Dog) {
//                Dog d = (Dog) a;
//                d.display();
//                System.out.println();
//            } else if (a instanceof Cat) {
//                Cat c = (Cat) a;
//                c.display();
//                System.out.println();
//            } else {
//                Cow co = (Cow) a;
//                co.display();
//                System.out.println();
//            }
            // using overriding
            a.display();
            System.out.println();
        }
    }
}