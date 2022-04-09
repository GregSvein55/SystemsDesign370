import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new BlackCoffee();
        Inventory inventory = new Inventory();

        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);

        System.out.println("------------------------\n\n");

        System.out.println("Hello! Welcome to my coffee shop!");
        System.out.println("Would you like a coffee?(yes/no)");
        String response = strScanner.nextLine().toLowerCase();

        if(response.equals("yes")  || response.equals("y")){

            System.out.println("How many milks would you like?");
            int milk  = intScanner.nextInt();

            System.out.println("How many creams would you like?");
            int cream  = intScanner.nextInt();

            System.out.println("How many cinnamon sprinkles would you like?");
            int cinnamon  = intScanner.nextInt();

            int coffeeUsed;
            int milkUsed;
            int creamUsed;
            int cinnamonUsed;

            coffeeUsed = inventory.getCoffee();
            coffeeUsed--;
            inventory.setCoffee(coffeeUsed);
            if (coffeeUsed < 0){
                System.out.println("We ran out of coffee!");
                System.exit(0);
            }

            for(int i = 0; i < milk; i++){
                milkUsed = inventory.getMilk();
                milkUsed--;
                inventory.setMilk(milkUsed);
                if (milkUsed >= 0){
                    coffeeMaker = new MilkDecorator(coffeeMaker);
                }else{

                    System.out.println("We ran out of milk!");
                    System.exit(0);
                }
            }

            for(int i = 0; i < cream; i++){
                creamUsed = inventory.getCream();
                creamUsed--;
                inventory.setMilk(creamUsed);
                if (creamUsed >= 0){
                    coffeeMaker = new CreamDecorator(coffeeMaker);
                }else{

                    System.out.println("We ran out of cream!");
                    System.exit(0);
                }
            }

            for(int i = 0; i < cinnamon; i++){
                cinnamonUsed = inventory.getCinnamon();
                cinnamonUsed--;
                inventory.setMilk(cinnamonUsed);
                if (cinnamonUsed >= 0){
                    coffeeMaker = new CinnamonDecorator(coffeeMaker);
                }else{

                    System.out.println("We ran out of cinnamon!");
                    System.exit(0);
                }

            }

            System.out.println("Order is: " + coffeeMaker.getIng());
            System.out.println("Price is: $" + coffeeMaker.getPrice());

        }else{
            System.out.println("All we sell is coffee. Goodbye.");
        }
    

        strScanner.close();
        intScanner.close();
    }
}
