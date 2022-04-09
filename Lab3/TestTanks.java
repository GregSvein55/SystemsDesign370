import java.util.Scanner;

public class TestTanks {
    public static void main(String[] args) {
        
        Tank tank = null;
        // Tank germany = new Germany();
        // Tank russia = new Russia();
        // Tank japan = new Japan();
        // Tank britain = new Britain();
        Factory tankFactory = new Factory();

        // test(usa);
        // test(germany);
        // test(russia);
        // test(japan);
        // test(britain);

        Scanner scan1 = new Scanner(System.in);

        System.out.println("The loop will run 5 times to allow you to test 5 tanks at a time");

        for (int index = 0; index < 5; index++) {

            System.out.print("Please enter the tank you want to test (1-5): ");
            int tankToTest = scan1.nextInt();

            tank = tankFactory.makeTank(tankToTest);

            if(tank != null){
                test(tank);
            }else System.out.println("Pick a number between 1 and 5 you silly goose");
        }     
        scan1.close();
        System.out.println("End of test");
    }
 
    public static void test(Tank tank) {
        tank.receiveHit(300, 50);
    }
}
