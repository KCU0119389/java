class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorTypesExample {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student1 = new Student();
        student1.displayDetails(); // Displays default values

        // Creating an object using the parameterized constructor
        Student student2 = new Student("Alice", 20);
        student2.displayDetails(); // Displays provided values
    }
}