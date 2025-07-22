public class Task4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
    }
}

// Base class
class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

// Subclass overriding method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
