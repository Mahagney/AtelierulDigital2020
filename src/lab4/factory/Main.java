package lab4.factory;

public class Main {

    public static void main(String[] args){
    PizzaFactory pizzaFactory = new NYPizzaStore();

    Pizza p1 = pizzaFactory.orderPizza("Cheese");
    System.out.println();

    Pizza p2 = pizzaFactory.orderPizza("Spicy");
    System.out.println();

    System.out.println(p1);
    System.out.println(p2);

    }

}
