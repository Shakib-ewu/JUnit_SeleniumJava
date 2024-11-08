package OOPS;

public class polymorphism {

	// Parent class
	class Animal {
	    // Method to be overridden
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	// Subclass Dog
	class Dog extends Animal {
	    // Overriding sound method
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	// Subclass Cat
	class Cat extends Animal {
	    // Overriding sound method
	    @Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class Main {
	    public void main(String[] args) {
	        // Polymorphism: Animal reference, Dog and Cat objects
	        Animal myDog = new Dog();
	        Animal myCat = new Cat();

	        // Calls the overridden methods
	        myDog.sound(); // Output: Dog barks
	        myCat.sound(); // Output: Cat meows
	    }
	}


}
