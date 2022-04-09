/**
 * Filename: ATM.java
 * 
 * Description: has public methods and nested classes that are the
 * inner workings of the atm
 * 
 * Author: Gregory Sveinbjornson
 */
public class ATM {

    public int cash;            //public variables
    public boolean inService;

    ATM() {                     //default constructor
        cash = 0;
        inService = false;
    }

    ATM(int x, boolean y) {                     //overloaded constructor
        cash = x;
        inService = y;
    }

    public int queryCash() {                    //returns cash
       
    
        return cash;
        
    }

    public void increaseCash(int x) {           //adds value to cash
        cash += x;

     
    }

    public void reduceCash(int x) {             //subtracts value from cash
        cash -= x;

    
    }

    public boolean getServiceStatus() {         //returns value of inService
        return inService;
    }

    public void changeServiceStatus() {         //toggles the value of inService and prints
        if (inService == true) {
            inService = false;
        }else{
            inService = true;
        }
        
        System.out.println("inService is now " + inService);    
        
    }



    
    public class CashDispenser {                //nested class, dispenses cash
    
        public void dispenseCash(int x) {
            reduceCash(x);

            System.out.println(x + " dollars has been dispensed");
        }

    }

    public class RecieptPrinter {               //nested class, prints reciepts
    
        public void printReceipt() {
            System.out.println("Receipt has been printed");
        }

    }

    public class CardReader {                   //nested class, reads card
        
        public void readCard() {
            System.out.println("Card has been read");
        }
        
    }

    public class KeypadDisplay {                //nested class, displays keypad
        
        public void displayPINverification() {
            System.out.println("PIN has been verified");
        }
        
    }

    CashDispenser dispenser = new CashDispenser(); //creating instances of all the nested classes
    RecieptPrinter printer = new RecieptPrinter();
    CardReader reader = new CardReader();
    KeypadDisplay display = new KeypadDisplay();

}


