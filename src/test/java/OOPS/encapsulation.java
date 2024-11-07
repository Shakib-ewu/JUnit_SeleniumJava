package OOPS;

public class encapsulation {

	
		// Define a class named `Person` with private fields
		public class Person {
		    // Private fields to restrict direct access
		    private String name;
		    private int age;

		    // Public getter method for `name`
		    public String getName() {
		        return name;
		    }

		    // Public setter method for `name`
		    public void setName(String name) {
		        this.name = name;
		    }

		    // Public getter method for `age`
		    public int getAge() {
		        return age;
		    }

		    // Public setter method for `age`
		    public void setAge(int age) {
		        // Optional: Add validation to control input
		        if (age > 0) {
		            this.age = age;
		        } else {
		            System.out.println("Please enter a valid age.");
		        }
		    }
		}

		// Main class to demonstrate encapsulation
		public class Main {
		    public void main(String[] args) {
		        // Create an object of the `Person` class
		        Person person = new Person();

		        // Set values using setter methods
		        person.setName("John Doe");
		        person.setAge(30);

		        // Access values using getter methods
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());
		    }
		}

	}


