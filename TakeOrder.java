import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
/**
 * Zephren de la Cerda
 * My Projects
 * 4/22/2018
 **/
public class TakeOrder {
    public static ArrayList newOrder = new ArrayList();

    public static void main(String[] args) {
        //String name = enterName();
        pizzaOptions();

        System.out.println(Arrays.toString(newOrder.toArray()));

        //printOrder("name");
    }

    public static String enterName() {
        String input = JOptionPane.showInputDialog("Enter a name for the order:");
        //if input != String
        //DO enterName();
        //else
        return input;
    }

    public static void pizzaOptions(){
        String[] possibilities = {"Cheese", "Pepperoni", "Specialty Pizzas", "Build Your Own", "Done"};
        String s = (String)JOptionPane.showInputDialog(null, "Choose your pizza: ", "Step 3",
                JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);

        if (s == possibilities[0]) {
            Pizza cheesePizza = new Pizza("Cheese","plain", "marinara", "mozzerella", "none",
                    BuildYourOwn.selectQuantity());
            newOrder.add(cheesePizza);
            pizzaOptions();
        } else if (s == possibilities[1]){
            Pizza pepPizza = new Pizza("Pepperoni","plain", "marinara","mozzerella","pepperoni",
                    BuildYourOwn.selectQuantity());
            newOrder.add(pepPizza);
            pizzaOptions();
        } else if (s == possibilities[2]){
            newOrder.add(SpecialtyPizzas.SpecialtyPizzas());
            pizzaOptions();
        } else if (s == possibilities[3]){
            newOrder.add(BuildYourOwn.BuildYourOwn());
            pizzaOptions();
        } else if (s == possibilities[4]){

        }
    }

    public static void printOrder(String newName){
        String formattedNewOrder = newOrder.toString()
                .replace("[", "")
                .replace("]", "");
        System.out.println(newName + " your pizza is ready! Here is your order--\n \n" + formattedNewOrder);
    }
}