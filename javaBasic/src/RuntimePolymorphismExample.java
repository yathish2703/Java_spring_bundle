class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw();  // Calls Circle's draw method

        myShape = new Rectangle();
        myShape.draw();  // Calls Rectangle's draw method
    }
}