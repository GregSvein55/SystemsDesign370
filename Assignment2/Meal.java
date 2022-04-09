 /**
 * Filename: Meal.java
 * 
 * Description: Adds meal and $10 to price, uses 
 * Decorator Pattern
 * 
 * Author: Gregory Sveinbjornson
 */
public class Meal extends TicketDecorator {

    protected MainTicketInterface Ticket;

    public Meal(MainTicketInterface Ticket) {//overloaded constructor
        this.Ticket = Ticket;
    }

    public int updatePrice() {
        int price = this.Ticket.updatePrice();//getting current price
        price += 10;//adding $10
        return price;
    }
}