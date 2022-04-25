Name your files as: 
Assumptions.pdf
UseCasesDescriptions.pdf
UseCaseDiagram.pdf
SoftwareSystemContextClassDiagram.pdf
EntityClassModelDiagram.pdf
EntityClassAttributesDiagram.pdf

In this assignment, you will perform a static design for an AmaZion Warehouse Manager system.
Here are the specification and the requirements:

Specifications

The Amazion Warehouse Manager is an inventory management system for a warehouse at
Amazion.com, a fairly popular online shopping system. The warehouse has two input lanes:
mail trucks and supplier trucks. Mail trucks bring returns to the warehouse. Returns have to go
through a manual inspection before they are accepted. If they are accepted, they are entered in
the warehouse as refurbished products and labeled with a specific barcode. A refund grant
request is then sent to the main Amazion financial system. If they are rejected, they are shipped
back to the customer.

Supplier trucks provide new merchandise. The merchandise is already classified with a unique
barcode, and once it enters the warehouse, it has to be stored according to the main storage
plans. There are forwarding robots that can pick up a pallet of merchandise, scan all barcodes,
and navigate the entire warehouse. The inventory management system only needs to receive
all barcodes, update the inventory, and instruct the robots to deposit the merchandise in the
sections of the warehouse corresponding to the inventory storage map. For the purpose of this
exercise, the inventory storage map is static, i.e., every item has a specific storage point.

The warehouse has only one output lane: the mail trucks. When the Amazion ordering system
notifies the warehouse, all the inventory management system has to do is to check that any of
the requested items are present. For all the items that are in the inventory, the inventory
management system adds the item and its location in the warehouse to a shipping list that
contains the address of the customer as supplied by the ordering system. Then, the inventory
management system removes the items from the inventory and provides the list of items to a
shipping robot, which retrieves the physical items in the warehouse, packages them together in
a suitable box, labels the box with a shipping label including the customer’s address, and sends
it to the mail truck loading dock. The inventory management systems then sends the shipping
list to the Amazion financial system, which invoices the customer for all the items that have
shipped.

Requirements
 Assumptions must be explicitly recorded in a separate document. The assumptions
document must be included.
 Use cases descriptions must be included
 A use case diagram must be included.
 A software system context class diagram must be included.
 An Entity class model diagram and an Entity class attributes diagram must be included.
 All diagrams must conform to the UML 2.0 standard.

The End
