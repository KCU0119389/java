public class Method {

    // Overloaded method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method 3: Adds two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method 4: Concatenates two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method obj = new Method();

        // Calling the method with integer parameters
        System.out.println("Sum of 2 integers: " + obj.add(10, 20));

        // Calling the method with 3 integer parameters
        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));

        // Calling the method with double parameters
        System.out.println("Sum of 2 doubles: " + obj.add(10.5, 20.5));

        // Calling the method with string parameters
        System.out.println("Concatenation of strings: " + obj.add("Hello, ", "World!"));
    }
}
