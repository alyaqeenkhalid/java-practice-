// Rectangle.java
public class Rectangle {
    // Variables
    double length;
    double width;

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create object of Rectangle
        Rectangle rect = new Rectangle();
        // Assign values
        rect.length = 10.0;
        rect.width = 5.0;
        // Calculate and print area
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}
