/**
 * This class creates a Car with a specified make, model, year and price, with getters and setters for the specified variables.
 */
public class Car {
    private String make, model;
    private int year;
    private double price;


    /**
     * Creates a Car with a String make, a String model, and an int year and int price.
     * @param make - The make of the car as a String.
     * @param model - The model of the car as a String,
     * @param year - The year of the car as an integer.
     * @param price - The price of the car as a double.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    /**
     * Getter for Car's make
     * @return returns the car's name as a String.
     */
    public String getMake() {
        return make;
    }
     /**
     * Getter for Car's model
     * @return returns the car's model as a String.
     */
    public String getModel() {
        return model;
    }
     /**
     * Getter for Car's year
     * @return returns the car's year as an integer.
     */
    public int getYear() {
        return year;
    }
    /**
     * Getter for Car's price
     * @return Returns the car's price as a double.
     */
    public double getPrice() {
        return price;
    }
    /**
     * Sets the car's make to a new String.
     * @param name - The new make of the car as a String.
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * Sets the car's model to a new String.
     * @param name - The new model of the Car as a String.
     */
    public void setModel(String model) {
        this.model = model;
    }
     /**
     * Sets the car's year to a new integer.
     * @param name - The new year of the car as an integer.
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Sets the car's price to a new double.
     * @param name - The new price of the car as a double.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}