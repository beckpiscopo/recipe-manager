/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipemanager;

import java.util.ArrayList;
import javax.swing.JFrame;


public class RecipeManager {
    
    //I will have all my recipes in here
    public static ArrayList<Recipe> allRecipes = new ArrayList<>();
    
    //the same for ingredients
    public static ArrayList<Ingredient> allIngredients = new ArrayList<>();
    
    public static IngredientsPanel ingPanel; 
    public static RecipePanel recPanel;

    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //add some hardcoded ingredients
        Ingredient egg;
        egg = new Ingredient();
        egg.setName("egg");
        egg.setUnitOfMeasurement("whole");
        egg.setPrice(.50);
        
        allIngredients.add(egg);
        
        Ingredient asparagus;
        asparagus = new Ingredient();
        asparagus.setName("asparagus");
        asparagus.setUnitOfMeasurement("bunch");
        asparagus.setPrice(4);
        
        allIngredients.add(asparagus);
        
        
        Ingredient quicheCrust;
        quicheCrust = new Ingredient();
        quicheCrust.setName("quiche crust");
        quicheCrust.setUnitOfMeasurement("whole");
        quicheCrust.setPrice(6);
        
        allIngredients.add(quicheCrust);
        
        
        
        Ingredient blackBeans;
        blackBeans = new Ingredient();
        blackBeans.setName("Black Beans");
        blackBeans.setUnitOfMeasurement("cup");
        blackBeans.setPrice(1);
        
        allIngredients.add(blackBeans);
        
        Ingredient tortillas;
        tortillas = new Ingredient();
        tortillas.setName("Tortillas");
        tortillas.setUnitOfMeasurement("whole");
        tortillas.setPrice(1);
        
        allIngredients.add(tortillas);
        
        
        
        
        Recipe asparagusQuiche = new Recipe();
        asparagusQuiche.setName("Asparagus Quiche");
        asparagusQuiche.addIngredient(asparagus, 3.4);
        asparagusQuiche.addIngredient(egg, 1);
        asparagusQuiche.addIngredient(quicheCrust,1);
        
        
        allRecipes.add(asparagusQuiche);
        
        
        
        
        Recipe blackBeanEnchiladas = new Recipe();
        blackBeanEnchiladas.setName("Black Bean Enchiladas");
        blackBeanEnchiladas.addIngredient(blackBeans, 1);
        blackBeanEnchiladas.addIngredient(tortillas, 8);

        
        
        allRecipes.add(blackBeanEnchiladas);
        
        
        //create a frame, and show my interface
        JFrame f = new JFrame("Ingredients");
        f.setSize(700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ingPanel = new IngredientsPanel();
        
        f.add(ingPanel);
        f.setVisible(true);
        
        //create a frame, and show my interface
        JFrame f2 = new JFrame("Recipes");
        f2.setSize(710, 600);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        recPanel = new RecipePanel();
        
        f2.add(recPanel);
        f2.setVisible(true);
        
        JFrame f3 = new JFrame("Main Frame");
        f3.setSize(810,600);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
