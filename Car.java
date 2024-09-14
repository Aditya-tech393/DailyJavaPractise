public class Car {
    // Fields of the class
    private String model;
    private int year;

    // Default constructor
    public Car() {
        model = "Unknown";
        year = 0;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Car myCar = new Car();

        // Default values are set by the constructor
        System.out.println("Car model: " + myCar.getModel());  // Output: Car model: Unknown
        System.out.println("Car year: " + myCar.getYear());    // Output: Car year: 0

        // Setting new values using setters
        myCar.setModel("Tesla Model S");
        myCar.setYear(2023);

        // Printing updated values
        System.out.println("Updated Car model: " + myCar.getModel());  // Output: Updated Car model: Tesla Model S
        System.out.println("Updated Car year: " + myCar.getYear());    // Output: Updated Car year: 2023
    }
}

