
/**
 * Filename: Operator.java
 * 
 * Description: methods related to operator use
 * 
 * Author: Gregory Sveinbjornson
 */
public class Operator extends Person{

    public void topUpATM(ATM atm) {                                 //adding funds to the atm
        System.out.println(atm.getServiceStatus());                 //checking cash and if its on
        System.out.println(atm.queryCash());

        if (atm.getServiceStatus() == true) {                       //turning the atm off
            atm.changeServiceStatus();
        }

        if (atm.queryCash() <= 5000) {                              //adding funds to atm
            atm.increaseCash(5000);
        }

        System.out.println("Current cash is " +atm.queryCash());    

        atm.changeServiceStatus();                                  //turning the atm on




    }

}

