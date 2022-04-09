public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
        
    }

    @Override
    public double getPrice() {       
        return super.getPrice() + SetUp.setUp.getMilkCost();

    }
    @Override
    public String getIng() {
        return super.getIng() + " + milk";
    }
}
