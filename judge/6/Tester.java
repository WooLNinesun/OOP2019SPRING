public class Tester {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 5);
        Pizza pizza3 = new Pizza();
        PizzaOrder order = new PizzaOrder();
        System.out.println(order.setNumberPizzas(5));
        order.setNumberPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        System.out.println(order.calcTotal());
        order.setNumberPizzas(3);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        order.setPizza3(pizza3);
        System.out.println(order.calcTotal());
    }
}
