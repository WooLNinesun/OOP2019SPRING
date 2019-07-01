
public class PizzaOrder {
    private Pizza[] pizzas;

    /**
     * Sets the number of pizzas in the order. If {numberPizzas} is not in the
     * range, the order is not valid and return false.
     * 
     * @param numberPizzas integer, 1 <= {numberPizzas} <= 3.
     * @return true if {numberPizzas} is between 1 and 3 ; returns false otherwise.
     */
    public boolean setNumberPizzas(int numberPizzas) {
        if (1 <= numberPizzas && numberPizzas <= 3) {
            this.pizzas = new Pizza[numberPizzas];
            return true;
        }
        return false;
    }

    /**
     * Setter for the first pizza in the order.
     * 
     * @param pizza
     */
    public void setPizza1(Pizza pizza) {
        setPizzaByIndex(pizza, 0);
    }

    /**
     * Setter for the second pizza in the order.
     * 
     * @param pizza
     */
    public void setPizza2(Pizza pizza) {
        setPizzaByIndex(pizza, 1);
    }

    /**
     * Setter for the third pizza in the order.
     * 
     * @param pizza
     */
    public void setPizza3(Pizza pizza) {
        setPizzaByIndex(pizza, 2);
    }

    /**
     * Setter for the {index} pizza in the order.
     * 
     * @param pizza
     * @param index
     */
    public void setPizzaByIndex(Pizza pizza, int index) {
        this.pizzas[index] = pizza;
    }

    /**
     * calculates the total cost of the order.
     * 
     * @return the total price in the pizza order.
     */
    public double calcTotal() {
        double sum_cost = 0;
        for (Pizza pizza : this.pizzas) {
            sum_cost += pizza.calcCost();
        }
        return sum_cost;
    }
}
