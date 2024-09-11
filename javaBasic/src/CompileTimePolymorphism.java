class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));        // Calls add(int, int)
        System.out.println(math.add(2, 3, 4));     // Calls add(int, int, int)
        System.out.println(math.add(2.5, 3.5));    // Calls add(double, double)
    }
}