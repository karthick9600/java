public class OverloadExample {

    // Method with 1 dint parameter
    public void display(int a) {
        System.out.println("Display with int: " + a);
    }

    // Method with 2 dint parameters
    public void display(int a, int b) {
        System.out.println("Display with two ints: " + a + ", " + b);
    }

    // Method with 1 double parameter
    public void display(double a) {
        System.out.println("Display with double: " + a);
    }

    // Method with String parameter
    public void display(String message) {
        System.out.println("Display with String: " + message);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(10);              // Calls method with dint
        obj.display(10, 20);          // Calls method with two hints
        obj.display(3.14);            // Calls method with double
        obj.display("Hello World");   // Calls method with String
    }
}
