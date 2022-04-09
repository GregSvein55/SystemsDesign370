 /**
 * Filename: Baggage.java
 * 
 * Description: Adds baggage and $20 to price, uses 
 * Decorator Pattern
 * 
 * Author: Gregory Sveinbjornson
 */

public class Baggage extends TicketDecorator {

    protected MainTicketInterface Ticket;

    public Baggage(MainTicketInterface Ticket) {//overloaded constructor
        this.Ticket = Ticket;
    }

    public int updatePrice() {
        int price = this.Ticket.updatePrice();//getting the current price
        price += 20;//adding $20
        return price;
    }
}