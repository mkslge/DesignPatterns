public class WhipCream extends CondimentDecorator{

    public WhipCream(Beverage beverage) {
        super(beverage);
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip Cream";
    }

    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}
