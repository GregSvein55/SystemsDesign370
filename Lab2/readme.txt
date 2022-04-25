Throughout the lab you have seen snippets of the vending machine in action, with slightly different
functionality depending on the example. Now you will do a full design using UML (Use Case Diagram,
Sequence and/or Communication, and Class Diagram) for the following two scenarios:

1. User Purchases a Soda
Happy path:
The user interacts with the Vending Machine User Interface class, which displays available products
A user may select from three products
The product price is displayed
A user may then insert some amount of money
The user may then attempt to purchase one of the three products
If enough money was entered and the soda is in stock,
the soda is dispensed
Change is returned

One of two exception cases may happen:
If insufficient money was inserted, the money is refunded, the user is informed the cause of failure
If a product is out of stock, the money is refunded, the user is informed the cause of failure
The vending machine needs to track both the product inventory and also the change added.

2. A maintainence person restocks the products
The maintenence person uses a key to switch the machine into maintenence mode
The maintainenece person then adds products
The maintainence person also removes change
Once maintainence is complete, the maintence person must manually enter the amount of inventory
for each product, and total change left in the machine.

One exception may happen:
If a product is discontinued, the maintainence person can replace tne product with a new one,
If so, they must also update the price and name for the new product

Your submission should include one use case diagram, one class diagram, and several communication or
sequence diagrams. For exception paths, you may draw the sequence or communication diagram just for
these steps, to reduce repetition.
