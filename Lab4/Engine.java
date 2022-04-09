
/**
 * Filename: Engine.java
 * 
 * Description: Changes the engine and adds the cost
 * 
 * Author: Gregory Sveinbjornson
 */
public class Engine extends CarDecorator{

    public Engine(Mustang newMustang){
        super(newMustang);
        System.out.println("Changing engine to V8");
    }

    public String getEngine(){
        return "V8";
    }

    public int getPrice(){
        return tempMustang.getPrice() + 5000;
    }
}
