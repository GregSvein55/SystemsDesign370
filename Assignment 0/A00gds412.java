/**
 * Filename: A00gds412.java
 * 
 * Description: MAin file for the ATM program, user can run the fake atm from this file
 * 
 * Author: Gregory Sveinbjornson
 */
import java.util.Scanner;

public class A00gds412 {
    public static void main(String[] args) {//main
        
        Scanner scan1 = new Scanner(System.in);         
        System.out.print("Please enter an integer between 0 and 10,000: ");//asking iser for amount ito go in atm2
        int amount  = scan1.nextInt();

        ATM atm1 = new ATM();//creating ATM class instances
        ATM atm2 = new ATM();

        atm2.increaseCash(amount); //adding cash to atm
        atm2.changeServiceStatus();//turning the atm on

        Operator user = new Operator();//creating operator instance

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please enter name for Operator: ");//getting name from user
        String name  = scan2.next();

        user.setName(name);

        System.out.println("The name is set to " + user.getName());

       
        System.out.println("Processing ATM 1");//topping up the atms
        user.topUpATM(atm1);

        System.out.println("Processing ATM 2");
        user.topUpATM(atm2);

        Customer customer = new Customer();
        System.out.print("Please enter name for Customer: ");//getting customer name from user
        String custName  = scan2.next();

        customer.setName(custName);
        System.out.println("The name is set to " + customer.getName());

        System.out.print("Please enter the amount you want to withdraw: ");//getting withdraw amount
        int withdrawAmount  = scan1.nextInt();

        customer.withdrawCash(atm2, withdrawAmount);

        scan1.close();//closing scanners used
        scan2.close();
    }
}
