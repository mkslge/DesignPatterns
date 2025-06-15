public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    public double getCost() {
        return beverage.getCost() + 0.25;
    }
}

