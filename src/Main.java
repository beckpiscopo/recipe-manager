
import java.util.Scanner; 

public class Main {
    
    private static Scanner keyboard = new Scanner(System.in);

    public static void Main(String args[]) {

        printActions();

            System.out.println("\nEnter action (4 to print options):");
            int action = keyboard.nextInt();
            keyboard.nextLine();

            switch (action) {
                case 1:
                    addNewIngredient();
                    break;
                case 2:
                   removeIngredient();
                   break;
                case 3:
                    printIngredients();
                    break;
                case 4:
                    printActions();
                    break;

            }
        }
    
    
    
        private static void addNewIngredient() {
        System.out.println("Enter new ingredient name: ");
        String ingredientName = keyboard.nextLine();

        System.out.println("Enter unit type: ");
        String unitType = keyboard.nextLine();
        
        System.out.println("Enter unit size: ");
        Double unitSize = keyboard.nextDouble();

        Ingredients newIngredient = Ingredients.createIngredient(ingredientName, unitType, unitSize);

    }
        
        private static void removeIngredient() {
        }
        
        private static void printIngredients() {
        }
        
        private static void printActions() {
        System.out.println("\nRecipe Manager options:");
        System.out.println("1 - to add an ingredient");
        System.out.println("2 - to remove an ingredient");
        System.out.println("3 - to print ingredients");
        System.out.println("4 - to print options.");

    }

    
    
}
