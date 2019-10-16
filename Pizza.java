/**
 * Zephren de la Cerda Project: Pizza Maker 4/22/2018
 **/

public class Pizza {
    String name;
    String crust;
    String sauce;
    String cheese;
    String toppings;
    int quantity;

    public Pizza(String name, String crust, String sauce, String cheese, String toppings, int quantity) {
        this.name = name;
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        if (quantity > 1) {
            return quantity + " " + name + " Pizzas\nCrust: " + crust + "\nSauce: " + sauce + "\nCheese: " + cheese +
                    "\nToppings: " + toppings + "\n \n";
        } else {
            return quantity + " " + name + " Pizza\nCrust: " + crust + "\nSauce: " + sauce + "\nCheese: " + cheese +
                    "\nToppings: " + toppings + "\n \n";

        }
    }
}