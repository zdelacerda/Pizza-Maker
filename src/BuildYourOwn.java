import javax.swing.*;
import java.util.ArrayList;

/**
 * Zephren de la Cerda
 * My Projects
 * 4/22/2018
 **/

public class BuildYourOwn {
    public static ArrayList<String> newToppings = new ArrayList();

    public static Pizza BuildYourOwn(){
        Pizza byoPizza = new Pizza("Build Your Own", selectCrust(),selectSauce(), selectCheese(), selectMeatToppings
                (), selectQuantity());
        //System.out.println(byoPizza);
        return byoPizza;
    }

    public static String selectCrust(){
        String[] possibilities = {"Plain", "Garlic", "Cheesy", "Thin", "Gluten Free"};
        String s = (String)JOptionPane.showInputDialog(null, "Select a crust: ", "Step 1",
                JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);
        return s;
    }

    public static String selectSauce(){
        String[] possibilities = {"Marinara", "Creamy Vodka", "BBQ", "Garlic", "No Sauce"};
        String s = (String)JOptionPane.showInputDialog(null, "Select a sauce: ", "Step 2",
                JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);
        return s;
    }

    public static String selectCheese(){
        String[] possibilities = {"Mozzarella", "Parmesan", "Ricotta"};
        String s = (String)JOptionPane.showInputDialog(null, "Select a cheese: ", "Step 3",
                JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);
        return s;
    }

    public static String selectMeatToppings(){
        String[] possibilities = {"Pepperoni", "Sausage", "Ham", "Bacon", "Chicken", "Veggie Toppings", "Done"};
        String s = (String)JOptionPane.showInputDialog(null, "Select your choice of meats: ",
                "Step 4", JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);
        if (s == possibilities[5]){
            selectVeggieToppings();
        } else if (s == possibilities[6]) {
            String formattedNewToppings = newToppings.toString()
                    .replace("[", "")
                    .replace("]", "");
            return formattedNewToppings;
        } else {
            newToppings.add(s);
            selectMeatToppings();
        }
        String formattedNewToppings = newToppings.toString()
                .replace("[", "")
                .replace("]", "");
        return formattedNewToppings;
    }

    public static String selectVeggieToppings(){
        String[] possibilities = {"Mushrooms", "Bell Peppers", "Onions", "Pineapple", "Meat Toppings", "Done"};
        String s = (String)JOptionPane.showInputDialog(null, "Select your choice of veggies: ",
                "Step 4", JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);
        if (s == possibilities[4]) {
            selectMeatToppings();
        } else if (s == possibilities[5]){
            String formattedNewToppings = newToppings.toString()
                    .replace("[", "")
                    .replace("]", "");
            return formattedNewToppings;
        } else {
            newToppings.add(s);
            selectVeggieToppings();
        }
        String formattedNewToppings = newToppings.toString()
                .replace("[", "")
                .replace("]", "");
        return formattedNewToppings;
    }

    public static int selectQuantity(){
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of pizzas:",
                "Step 5", JOptionPane.QUESTION_MESSAGE));

        return input;
    }
}