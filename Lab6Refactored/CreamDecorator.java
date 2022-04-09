public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }
    @Override
    public double getPrice() {
        return super.getPrice() + SetUp.setUp.getCreamCost();

    }
    @Override
    public String getIng() {
        return super.getIng() + " + cream";
    }
}