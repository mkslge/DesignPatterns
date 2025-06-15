public class Coffee extends Beverage{
    public Coffee(){}

    @Override
    public String getDescription(){
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 2.50;
    }
}
