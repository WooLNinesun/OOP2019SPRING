
public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    public Pizza() {
        this.size = new String("small");
        this.cheese = 1;
        this.pepperoni = 1;
        this.ham = 1;
    }

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    public String getSize() {
        return this.size;
    }

    public int getNumberOfCheese() {
        return this.cheese;
    }

    public int getNumberOfPepperoni() {
        return this.pepperoni;
    }

    public int getNumberOfHam() {
        return this.ham;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumberOfCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setNumberOfPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setNumberOfHam(int ham) {
        this.ham = ham;
    }

    public double calcCost() {
        double cost = 2 * (this.cheese + this.pepperoni + this.ham);
        switch (this.size) {
        case "small":
            cost += 10;
            break;
        case "medium":
            cost += 12;
            break;
        case "large":
            cost += 14;
            break;
        default:
        }
        return cost;
    }

    public boolean equals(Pizza diff) {
        return this.size.equals(diff.size) && this.cheese == diff.cheese && this.pepperoni == diff.pepperoni
                && this.ham == diff.ham;
    }

    public String toString() {
        return String.format("size = %s, numOfCheese = %d, numOfPepperoni = %d, numOfHam = %d", this.size, this.cheese,
                this.pepperoni, this.ham);
    }
}
