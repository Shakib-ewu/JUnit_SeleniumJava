package AllTests;

// Superclass
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
  
    public void sound() {
        System.out.println("Cat meows");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Dog myDog = new Dog();       // Animal reference but Dog object
        Cat myCat = new Cat();       // Animal reference but Cat object

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks (method overridden in Dog)
        myCat.sound();    // Output: Cat meows (method overridden in Cat)
    }
}
