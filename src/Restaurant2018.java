
import java.util.Scanner;

public class Restaurant2018 {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        printActions();

            System.out.println("\nEnter action (4 to print options):");
            int action = keyboard.nextInt();
            keyboard.nextLine();

            switch (action) {
                case 1:
                    addRecipe(); 
                    break;
                case 2:
                    modifyRecipe();
                   break;
                case 3:
                    printRecipe();
                    break;
                case 4:
                    printActions();
                    break;

            }
        }
        
        private static void printActions() {
            System.out.println("\nRecipe Manager options:");
            System.out.println("1 - to add a recipe");
            System.out.println("2 - to modify a recipe");
            System.out.println("3 - print recipes");
            System.out.println("4 - to print options.");

    }
        private static void addRecipe() {
            System.out.println("What is the recipe's name?");
            System.out.println("What is the recipe's first ingredient?");
            System.out.println("What is the recipe's first ingredient?");   
            
        }
    
        
        private static void printRecipe() {

        Ingredient lasagnaNoodles; 
            lasagnaNoodles = new Ingredient(); 
            lasagnaNoodles.setName("Lasagna Noodles"); 
            lasagnaNoodles.setUnitOfMeasurement("pieces"); 
            lasagnaNoodles.setPrice(3.00);
        
        Ingredient spinach; 
            spinach = new Ingredient(); 
            spinach.setName("Spinach"); 
            spinach.setUnitOfMeasurement("oz"); 
            spinach.setPrice(5.00);
            
        Ingredient garlic; 
            garlic = new Ingredient(); 
            garlic.setName("Garlic");
            garlic.setUnitOfMeasurement("tbs");
            garlic.setPrice(2.00);
        
        Ingredient tomatoSauce; 
            tomatoSauce = new Ingredient(); 
            tomatoSauce.setName("Tomato Sauce");
            tomatoSauce.setUnitOfMeasurement("oz");
            tomatoSauce.setPrice(2.00);
                
        
        Ingredient veganCheese; 
            veganCheese = new Ingredient(); 
            veganCheese.setName("Vegan Cheese");
            veganCheese.setUnitOfMeasurement("oz");
            veganCheese.setPrice(4.00); 
            
        Ingredient sandwichBread; 
            sandwichBread = new Ingredient(); 
            sandwichBread.setName("Sandwich Bread"); 
            sandwichBread.setUnitOfMeasurement("slice");
            sandwichBread.setPrice(1.0);
            
            
        Recipe lasagna; 
            lasagna = new Recipe(); 
            lasagna.setName("Lasagna");
            lasagna.addIngredient(lasagnaNoodles, 10);    
            lasagna.addIngredient(spinach, 1);
            lasagna.addIngredient(garlic, 1.5); 
            lasagna.addIngredient(tomatoSauce, 2);
            
        
        Recipe grilledCheese; 
            grilledCheese = new Recipe(); 
            grilledCheese.setName("Grilled Cheese");
            grilledCheese.addIngredient(sandwichBread, 2);
            grilledCheese.addIngredient(veganCheese, 1);
            grilledCheese.addIngredient(spinach, 1);

        
        
        System.out.println("Recipe " + lasagna.getName() + " costs " + lasagna.computeCost());
        System.out.println("");
        System.out.println(lasagna.getIngredientCount() + " ingredients:");
        
        for(int i = 0; i < lasagna.getIngredientCount(); i++){
            System.out.println(lasagna.getQuantity(i) + " of " + lasagna.getIngredient(i).getName() +
                    " at " + lasagna.getIngredient(i).getPrice() + " dollars per " + 
                    lasagna.getIngredient(i).getUnitOfMeasurement());
        }
        
        
        System.out.println("");
        System.out.println("Recipe " + grilledCheese.getName() + " costs " + grilledCheese.computeCost());
        System.out.println("");
        System.out.println(grilledCheese.getIngredientCount() + " ingredients:");
        
        for(int i = 0; i < grilledCheese.getIngredientCount(); i++){
            System.out.println(grilledCheese.getQuantity(i) + " of " + grilledCheese.getIngredient(i).getName() +
                    " at " + grilledCheese.getIngredient(i).getPrice() + " dollars per " + 
                    grilledCheese.getIngredient(i).getUnitOfMeasurement());
    }

       
        
}
          static void modifyRecipe() {
              

        }
        

}

        