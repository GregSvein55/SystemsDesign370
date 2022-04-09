 /**
 * Filename: TicketDecorator.java
 * 
 * Description: subclass of ticket interface, uses Decorator Pattern
 * 
 * Author: Gregory Sveinbjornson
 */
public class TicketDecorator implements MainTicketInterface {

    protected MainTicketInterface ticket;

    public int updatePrice() {
        return ticket.updatePrice();
    }

}
