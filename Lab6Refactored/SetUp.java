import java.util.Scanner;
public class SetUp {
    static SetUp setUp = new SetUp();
    private int size;
    private double coffeeCost;
    private double milkCost;
    private double creamCost;
    private double cinnamonCost;

    private SetUp(){}

    public static SetUp getInstance() {
        return setUp;
    }



    public void setUp() {
        Scanner intScanner = new Scanner(System.in);
        Scanner dblScanner = new Scanner(System.in);

        System.out.println("How many units do you want the resevoirs to hold?: ");
        size = intScanner.nextInt();

        System.out.println("Set the price for a unit of coffee: ");
        coffeeCost = dblScanner.nextDouble();

        System.out.println("Set the price for a unit of milk: ");
        milkCost = dblScanner.nextDouble();

        System.out.println("Set the price for a unit of cream: ");
        creamCost = dblScanner.nextDouble();

        System.out.println("Set the price for a unit of cinnamon: ");
        cinnamonCost = dblScanner.nextDouble();

        
    }


    public int getSize() {
        return size;
    }

    public double getCoffeeCost() {
        return coffeeCost;
    }

    public double getMilkCost() {
        return milkCost;
    }

    public double getCreamCost() {
        return creamCost;
    }

    public double getCinnamonCost() {
        return cinnamonCost;
    }


}



