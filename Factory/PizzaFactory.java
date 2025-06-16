public class PizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        //this part of the code is then the only part that needs to be changed
        if(pizzaType.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if(pizzaType.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        } else {
            return null;
        }
        //this will stay the same no matter what
        pizza.order();
        pizza.prepare();
        pizza.make();
        pizza.serve();
        return pizza;
    }
}
