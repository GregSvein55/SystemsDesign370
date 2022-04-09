/**
 * Filename: ustomer.java
 * 
 * Description: methods used for customer activities
 * 
 * Author: Gregory Sveinbjornson
 */
public class Customer extends Person{
    public void withdrawCash(ATM atm, int amount) {                         //withdrawing cash method
        System.out.println(atm.getServiceStatus());

        if (atm.getServiceStatus() == false) {                              //checking if atm is off
            System.out.println("ATM is not in service");
        }

        if (atm.queryCash() < amount) {                                     //checking if atm has enough cash to dispense funds
            System.out.println("ATM has insufficient funds");
        }

        atm.reader.readCard();                              //atm methods are running
        atm.display.displayPINverification();
        atm.dispenser.dispenseCash(amount);
        atm.printer.printReceipt();

        System.out.println(amount + " successfully withdrawn from Atm");
    }
}
