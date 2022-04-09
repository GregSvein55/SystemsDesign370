class BlackCoffee implements CoffeeMaker{
    
    @Override
    public double getPrice(){

        return SetUp.setUp.getCoffeeCost();
    }

    @Override
    public String getIng(){    
        return "Coffee";
    }

}
