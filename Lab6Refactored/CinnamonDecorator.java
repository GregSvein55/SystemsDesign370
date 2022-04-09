public class CinnamonDecorator extends CoffeeDecorator{
    public CinnamonDecorator(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + SetUp.setUp.getCinnamonCost();

    }
    @Override
    public String getIng() {

        return super.getIng() + " + cinnamon";

    }
}
