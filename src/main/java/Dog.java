/**
 * This class creates a Dog with a specified name, breed, and weight, with getters and setters for the specified variables.
 */
public class Dog {
    private String name, breed;
    private int weight;


    /**
     * Creates a dog with a String name, a String breed, and an int weight.
     * @param name - The name of the dog as a String.
     * @param breed - The breed of the dog as a String,
     * @param weight - The weight of the dog as an integer.
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    /**
     * Getter for Dog's name
     * @return returns the dog's name as a String.
     */
    public String getName() {
        return name;
    }
     /**
     * Getter for Dog's breed
     * @return returns the dog's breed as a String.
     */
    public String getBreed() {
        return breed;
    }
     /**
     * Getter for Dog's weight
     * @return returns the dog's weight as an integer.
     */
    public int getWeight() {
        return weight;
    }
    /**
     * Sets the dog's name to a new String.
     * @param name - The new name of the dog as a String.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sets the dog's breed to a new String.
     * @param name - The new breed of the dog as a String.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
     /**
     * Sets the dog's weight to a new integer.
     * @param name - The new weight of the dog as an integer.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}