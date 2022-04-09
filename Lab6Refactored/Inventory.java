public class Inventory {
    private int milk;
    private int coffee;
    private int cream;
    private int cinnamon;

    /**
     * Constructor
     */
    public Inventory(){
        
    	SetUp.setUp.setUp();

    	milk = SetUp.setUp.getSize();
    	coffee = SetUp.setUp.getSize();
    	cream = SetUp.setUp.getSize();
        cinnamon = SetUp.setUp.getSize();

        setMilk(milk);
        setCoffee(coffee);
        setCream(cream);
        setCinnamon(cinnamon);
    }

    
    /**
     * Getter of the property <tt>milk</tt>
     *
     * @return Returns the milk.
     *
     */
    public int getMilk() {
    	return milk;
    }

    /**
     * Setter of the property <tt>milk</tt>
     *
     * @param milk
     *                The milk to set.
     *
     */
    public void setMilk(int milk) {
    	this.milk = milk;
    }


    /**
     * Getter of the property <tt>coffee</tt>
     *
     * @return Returns the coffee.
     *
     */
    public int getCoffee() {
    	return coffee;
    }

    /**
     * Setter of the property <tt>coffee</tt>
     *
     * @param coffee
     *                The coffee to set.
     *
     */
    public void setCoffee(int coffee) {
    	this.coffee = coffee;
    }


    /**
     * Getter of the property <tt>cream</tt>
     *
     * @return Returns the cream.
     *
     */
    public int getCream() {
    	return cream;
    }

    /**
     * Setter of the property <tt>cream</tt>
     *
     * @param cream
     *                The cream to set.
     *
     */
    public void setCream(int cream) {
    	this.cream = cream;
    }

    /**
     * Getter of the property <tt>cinnamon</tt>
     *
     * @return Returns the cinnamon.
     *
     */
    public int getCinnamon() {
    	return cinnamon;
    }

    /**
     * Setter of the property <tt>cinnamon</tt>
     *
     * @param cinnamon
     *                The cinnamon to set.
     *
     */
    public void setCinnamon(int cinnamon) {
    	this.cinnamon = cinnamon;
    }
}
