public class Fish {
    private String name;
    private int weight;
    private String color;
    private Boolean status;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Fish(String name, int weight, String color, Boolean status) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public Fish() {
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}


// There are 3 kind of fishes:
// - Clownfish, gains 1 gramm when feeded and has stripe color.
// - Tang, gains 1 gramms when feeded and can suffer short-term memory loss.
// - Koi, gains 2 gramms when feeded.
// Each fish has a name, weight, color and has a status and feed method.

// Create an aquarium and take care of your fishes.
// Create a method on the aquarium that feeds all the fishes in the aquarium:
// increases the weight of every fish with the amount of gramms they gain when feeded.
// Create a method on the aquarium that removes the big fishes.
// A big fish's weight is at least 11 gramms.
// The aquarium has a status method it should print the status for each fish.