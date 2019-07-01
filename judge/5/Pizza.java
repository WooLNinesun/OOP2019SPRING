public class Pizza {
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    /**
     * Default constructor that set size to small, the other three instance
     * variables to 1.
     */
    public Pizza() {
        this("small", 1, 1, 1);
    }

    /**
     * Constructor that can set all of the instance variables.
     * 
     * @param size      either small, medium or large.
     * @param cheese    the number of cheese toppings.
     * @param pepperoni the number of pepperoni toppings
     * @param ham       the number of ham toppings.
     */
    public Pizza(String size, int cheese, int pepperoni, int ham) {
        setSize(size);
        setNumberOfCheese(cheese);
        setNumberOfPepperoni(pepperoni);
        setNumberOfHam(ham);
    }

    /**
     * Getter for size.
     * 
     * @return self pizza size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * 
     * Setter for size.
     * 
     * @param size pizza size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Getter for number of cheese toppings.
     * 
     * @return self number of cheese toppings.
     */
    public int getNumberOfCheese() {
        return this.cheese;
    }

    /**
     * 
     * Setter for number of cheese toppings.
     * 
     * @param cheese the number of cheese toppings.
     */
    public void setNumberOfCheese(int cheese) {
        this.cheese = cheese;
    }

    /**
     * Getter for number of pepperoni toppings.
     * 
     * @return self number of pepperoni toppings.
     */
    public int getNumberOfPepperoni() {
        return this.pepperoni;
    }

    /**
     * 
     * Setter for number of pepperoni toppings.
     * 
     * @param cheese the number of pepperoni toppings.
     */
    public void setNumberOfPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    /**
     * Getter for number of ham toppings.
     * 
     * @return self the number of ham toppings.
     */
    public int getNumberOfHam() {
        return this.ham;
    }

    /**
     * 
     * Setter for number of ham toppings.
     * 
     * @param cheese the number of ham toppings.
     */
    public void setNumberOfHam(int ham) {
        this.ham = ham;
    }

    /**
     * Pizza cost is determined by: size cost + $2 per topping.
     * 
     * size cost: Small: $10, Medium: $12, Large: $14.
     * 
     * @return the price of the pizza.
     */
    public double calcCost() {
        // $2 per topping.
        double cost = 2 * (this.cheese + this.pepperoni + this.ham);
        // size cost
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

    /**
     * Determine whether this pizza is the same as the other one by their size, the
     * number of cheese toppings, the number of pepperoni toppings, and the number
     * of ham toppings.
     * 
     * @param diff
     * @return true if the caller Pizza object p2 has the same information with the
     *         inputed {diff} pizza object, return false otherwise.
     */
    @Overload
    public boolean equals(Pizza diff) {
        return this.size.equals(diff.size) && this.cheese == diff.cheese && this.pepperoni == diff.pepperoni
                && this.ham == diff.ham;
    }

    /**
     * Showing the information of the pizza
     * 
     * @return Output format is as: "size = small, numOfCheese = 0, numOfPepperoni =
     *         0, numOfHam = 0".
     */
    @Override
    public String toString() {
        return String.format("size = %s, numOfCheese = %d, numOfPepperoni = %d, numOfHam = %d", this.size, this.cheese,
                this.pepperoni, this.ham);
    }
}
