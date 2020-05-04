package lab4.factory;

public class NYPizzaStore extends PizzaFactory{
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("Spicy")){
            pizza = new NYSpicyPizza();
        } else
            if(type.equals("Cheese")){
                pizza = new NYCheesePizza();
            }
        return pizza;
    }
}
