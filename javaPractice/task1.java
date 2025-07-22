// Person.java
public class Person {
    // Variables
    String name;
    int age;

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object of Person
        Person p = new Person();
        // Assign values
        p.name = "Alice";
        p.age = 25;
        // Call the display method
        p.display();
    }
}
