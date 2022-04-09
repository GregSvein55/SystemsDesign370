abstract class CoffeeDecorator implements CoffeeMaker{
    protected CoffeeMaker coffeeMaker;

    public CoffeeDecorator(CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public double getPrice(){
        return coffeeMaker.getPrice();
    }

    @Override
    public String getIng(){ 
        return coffeeMaker.getIng();
    }

}
