package AllTests; // Ensure this matches the folder structure

// Abstract class
abstract class Animal1 {
    // Abstract method (no implementation)
    public abstract void sound();
    
    // Concrete method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass Dog extends the abstract class Animal
class Dog1 extends Animal1 {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat extends the abstract class Animal
class Cat1 extends Animal1 {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate abstraction
public class Abstraction { // Make sure the file name is Abstraction.java
    public static void main(String[] args) {
        Animal1 myDog = new Dog1(); // Animal reference but Dog object
        Animal1 myCat = new Cat1(); // Animal reference but Cat object

        myDog.sound(); // Output: Dog barks
        myDog.sleep(); // Output: Animal is sleeping

        myCat.sound(); // Output: Cat meows
        myCat.sleep(); // Output: Animal is sleeping
    }
}
