public class Person {
    private String name;
    private int age;

    // Constructor to initialize the properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Instantiate an object of the Person class
        Person person = new Person("John Doe", 25);

        // Call the displayDetails method
        person.displayDetails();
    }
}
