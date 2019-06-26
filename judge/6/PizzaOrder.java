
public class PizzaOrder {
    private Pizza[] pizzas;

    public boolean setNumberPizzas(int numberPizzas) {
        if (1 <= numberPizzas && numberPizzas <= 3) {
            this.pizzas = new Pizza[numberPizzas];
        }
        return false;
    }

    public void setPizza1(Pizza pizza) {
        this.pizzas[0] = pizza;
    }

    public void setPizza2(Pizza pizza) {
        this.pizzas[1] = pizza;
    }

    public void setPizza3(Pizza pizza) {
        this.pizzas[2] = pizza;
    }

    public double calcTotal() {
        double sum_cost = 0;
        for (Pizza pizza : this.pizzas) {
            sum_cost += pizza.calcCost();
        }
        return sum_cost;
    }
}
