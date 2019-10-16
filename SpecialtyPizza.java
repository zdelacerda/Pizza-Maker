import java.util.HashMap;

import javax.swing.JOptionPane;

/**
 * Zephren de la Cerda
 * My Projects
 * 4/25/2018
 **/
public class SpecialtyPizza {

    public static Pizza supreme = new
            Pizza("Supreme","plain", "marinara", "mozzerlla","pepperoni, sausage, bell peppers, mushrooms",
            BuildYourOwn.selectQuantity());
    public static Pizza hawaiian = new
            Pizza("Hawaiian","plain", "marinara", "mozzerlla","ham and pineapple", BuildYourOwn.selectQuantity());
    public static Pizza bbqChicken = new
            Pizza("BBQ Chicken","plain", "BBQ", "mozzerlla","chicken, bacon, onions, pineapple",
            BuildYourOwn.selectQuantity());
    public static Pizza margarita = new
            Pizza("Margarita","plain", "marinara", "mozzerlla","tomatoes, parmesean, fresh basil",
            BuildYourOwn.selectQuantity());


    public static Pizza SpecialtyPizzas(){
        String[] possibilities = {"Supreme", "Hawaiian", "BBQ Chicken", "Margarita"};
        Pizza[] specialtyPizzas = {supreme, hawaiian, bbqChicken, margarita};
        HashMap<String, Pizza> database = new HashMap<>();

        for (int i = 0; i < possibilities.length; i++){
            database.put(possibilities[i],specialtyPizzas[i]);
        }

        String s = (String) JOptionPane.showInputDialog(null, "Choose a Specialty Pizza: ", "Step 2",
                JOptionPane.QUESTION_MESSAGE, null, possibilities, possibilities[0]);
        return database.get(s);
        }

    }