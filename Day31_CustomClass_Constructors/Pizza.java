package Day31_CustomClass_Constructors;

public class Pizza {

    public char size;
    public int numberofCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberofCheeseTopping, int numberOfPepperoniTopping) {

        this.size = size;
        this.numberofCheeseTopping = numberofCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calCost() {
        double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;

        double totalPrice =  startingPrice + (numberofCheeseTopping + numberOfPepperoniTopping) * 2 ;

        return totalPrice ;



    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberofCheeseTopping=" + numberofCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price = $" + calCost()+
                '}';
    }
}


