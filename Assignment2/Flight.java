 /*
 * Filename: Flight.java
 * 
 * Description: main flight db to hold flight info,
 * uses Design Pattern
 * 
 * Author: Gregory Sveinbjornson
 */
public class Flight {

    private String departureCity;//declaring variables
    private String arrivalCity;
    private int departureTime;
    private int price;
	
    Flight(String departureCity, String arrivalCity, int departureTime, int price) {//overloaded constructor
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.price = price;
    }

    /*
    *  setters and getters for all variables
    */

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;

    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrival(String arrivalCity) {
        this.arrivalCity = arrivalCity;

    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

}