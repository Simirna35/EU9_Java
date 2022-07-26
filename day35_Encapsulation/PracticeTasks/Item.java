package day35_Encapsulation.PracticeTasks;

public class Item {

    /*
   Encapsulation (DATA HIRING) means that we restrict(protect) the sensitive stored  data with private access modifier
   There are 4 access modifier and Private AM is used to limit the access to the data.

   We can access this stored data with 2 methods getter(to read data) and setter (read and update data)

    */

    private String name;
    private double unitPrice;
    private int quantity;


    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        for (int i = 0; i < name.length(); i++) { //name can not contain any special characters other than space
            char ch = name.charAt(i);                     // name must start with letters


            if (!Character.isLetterOrDigit(ch) && ch == ' ') {
                this.name = name;
            } else if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                System.err.println("Item name can not contain any special characters other than space!");
                System.exit(0);
            }
        }

        if (name.isEmpty() || name.isBlank()) {            // name can not be empty or blank
            System.err.println("Item name can not be Empty Or Blank!");
            System.exit(0);
        } else if (!Character.isLetter(name.charAt(0))) {
            System.err.println("Item must start with letter!");
            System.exit(0);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.out.println("Unit price can not be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {             // quantity can not be negative
        if (quantity < 0) {
            System.out.println("Quantity can not be negative");
            System.exit(1);
        } else if (name.equalsIgnoreCase("toilet paper")) { //if the Item name is toilet paper (case insensitive)
            quantity = 1;                                             // then the quantity can not be more than 1

        }
        this.quantity = quantity;
    }

    public double calcCost() {

        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost = $ " + calcCost() +
                '}';
    }
}


    /*
    4. Item Task
		create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
     */

