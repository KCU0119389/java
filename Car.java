public class Car {

    // Constructor 1: Default constructor with no parameters
    public Car() {
        System.out.println("This is a default car.");
    }

    // Constructor 2: Constructor with one parameter (brand of the car)
    public Car(String brand) {
        System.out.println("This is a " + brand + " car.");
    }

    // Constructor 3: Constructor with two parameters (brand and model of the car)
    public Car(String brand, String model) {
        System.out.println("This is a " + brand + " car, model: " + model + ".");
    }

    // Constructor 4: Constructor with three parameters (brand, model, and year of the car)
    public Car(String brand, String model, int year) {
        System.out.println("This is a " + brand + " car, model: " + model + ", year: " + year + ".");
    }

    public static void main(String[] args) {
        // Using different constructors to create objects
        Car car1 = new Car(); // Calls the default constructor
        Car car2 = new Car("Toyota"); // Calls the constructor with one parameter
        Car car3 = new Car("Honda", "Civic"); // Calls the constructor with two parameters
        Car car4 = new Car("Ford", "Mustang", 2022); // Calls the constructor with three parameters
    }
}
