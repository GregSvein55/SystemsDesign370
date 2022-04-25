In this assignment, you will create a Java program to represent a flight ticket reservation system.

Necessary functionalities include:
1. readUserInput() : reads in departure and arrival city from user,
2. retrieveFlightFromDatabase() : looks for a match in departure and arrival cities from the
database,
3. displayFlights() : displays the flight information to the user

The database consists of an array of flights, where each flight contains the following
information:
1. departureCity : String
2. arrivalCity : String
3. departureTime : int (a 4 digit number, e.g. 1500)
4. price : int (in dollars)

You are to construct an iterator that will iterate through the database and print out all flights
that match the departure and arrival city provided by the user. After that, you will ask the user
to select one of the flights.

After the user has selected a flight, create an object that represents a flight ticket that has the
selected flight schedule. Now ask the user for additional add-ons to the flight ticket:
1. extra legroom seats
2. in-flight meals
3. excess baggage.

The flight ticket reservation process is then complete.

Design the system using design pattern(s) that you have learnt in class (you may use more than
one design pattern at the same time). Note that in your design you must separate the
functionalities, be able to iterate through the database, and be able to easily add any (or all)
options to the flight ticket.

In your main program file, create a database consisting of only the following three entries:
1. Regina to Vancouver, 0900 hrs, $300
2. Regina to Vancouver, 1500 hrs, $350
3. Regina to Toronto, 1300 hrs, $500
and make a query to find a flight from Regina to Vancouver, and then add inflight meals ($10
extra) and excess baggage ($20 extra). Print out the details of the final ticket.
Please include comments to explain which design pattern(s) you are using and what are the
classes in that design pattern.

Your output should look as follows:
$ java A02jon123
Enter Departure City :
Regina
Enter Arrival City :
Vancouver
Flights found :
(1) Regina Vancouver 0900H $300
(2) Regina Vancouver 1500H $350
Which flight do you want?
1
Do you want to add extra legroom seats (Y/N)?
N
Do you want to add in-flight meals (Y/N)?
Y
Do you want to add excess baggage (Y/N)?
Y
Your final flight information is :
Departure City : Regina
Arrival City : Vancouver
Time : 0900H
Extra Legroom : N
In-flight meals : Y
Excess Baggage : Y
Total Price : $330
$

The End
