public class CheesePizza implements Pizza{
    private final String name = "Cheese Pizza";
    public CheesePizza(){}
    public void order() {
        System.out.println("Ordered " + name);
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void make() {
        System.out.println("Making " + name);
    }
    public void serve() {
        System.out.println("Serving " + name);
    }
}

