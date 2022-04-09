 /*
 * Filename: Seat.java
 * 
 * Description: Adds seat room and $30 to price, uses 
 * Decorator Pattern
 * 
 * Author: Gregory Sveinbjornson
 */
public class Seat extends TicketDecorator {

    protected MainTicketInterface Ticket;

    public Seat(MainTicketInterface Ticket) {//overloaded constructor
        this.Ticket = Ticket;
    }

    public int updatePrice() {
        int price = this.Ticket.updatePrice();//getting current price
        price += 30;//adiing $30
        return price;
    }

}