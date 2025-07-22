public class Task5 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.getArea());

        Square s = new Square(4);
        System.out.println("Area of Square: " + s.getArea());
    }
}

// Interface
interface Shape {
    double getArea();
}

// Circle class implements Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square class implements Shape
class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
