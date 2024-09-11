public class Main {
    private String message;

    // Default constructor
    public Main() {
        this.message = "Hello world!";
    }

    // Parameterized constructor
    public Main(String message) {
        this.message = message;
    }

    // Copy constructor
    public Main(Main other) {
        this.message = other.message;
    }

    public static void main(String[] args) {
        // Using default constructor
        Main defaultMain = new Main();
        System.out.println(defaultMain.message);

        // Using parameterized constructor
        Main paramMain = new Main("Hello, IntelliJ IDEA!");
        System.out.println(paramMain.message);

        // Using copy constructor
        Main copyMain = new Main(paramMain);
        System.out.println(copyMain.message);
    }
}