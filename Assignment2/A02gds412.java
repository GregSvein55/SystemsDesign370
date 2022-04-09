
 /**
 * Filename: A02gds412.java
 * 
 * Description: Main file for flight program, uses
 * MVC Pattern, and Decorator Pattern
 * 
 * Author: Gregory Sveinbjornson
 */
public class A02gds412 {
    public static void main(String[] args) {

        FlightModel model = new FlightModel();//creating instances of classes
        ViewFlight view = new ViewFlight();
        AddExtras addExtras = new AddExtras(model, view); 
       
        model.addFlights();//populating the db

        addExtras.readUserInput();//querying the user
          
    }
}
