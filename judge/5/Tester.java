public class Tester {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("large", 3, 1, 5);
        System.out.println(pizza.getSize());
        System.out.println(pizza.getNumberOfCheese());
        System.out.println(pizza.getNumberOfPepperoni());
        System.out.println(pizza.getNumberOfHam());
        pizza = new Pizza();
        pizza.setSize("medium");
        pizza.setNumberOfCheese(2);
        pizza.setNumberOfPepperoni(4);
        pizza.setNumberOfHam(1);
        System.out.println(pizza.getSize());
        System.out.println(pizza.getNumberOfCheese());
        System.out.println(pizza.getNumberOfPepperoni());
        System.out.println(pizza.getNumberOfHam());
        System.out.println(pizza.calcCost());
        System.out.println(pizza.toString());
        System.out.println(pizza.equals(new Pizza("large", 2, 4, 1)));
        System.out.println(pizza.equals(new Pizza()));
        System.out.println(pizza.equals(new Pizza("medium", 2, 4, 1)));
    }
}
