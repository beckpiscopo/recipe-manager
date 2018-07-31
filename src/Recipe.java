
import java.util.ArrayList;

public class Recipe {
    String name;
    ArrayList<Ingredient> ingredients;
    ArrayList<Double> quantities;
    
    public Recipe(){
        ingredients = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    void addIngredient(Ingredient ing, double howMuch){
        ingredients.add(ing);
        quantities.add(howMuch);
    }
    
    void removeIngredient(int index){ //no error checking on index being valid
        ingredients.remove(index);
        quantities.remove(index);
    }
    
    void removeIngredient(Ingredient ing){
        int index = ingredients.indexOf(ing); //find out the index
        removeIngredient(index); //do the work in the previous function
    }
    
    void changeIngredient(Ingredient ing, double newQuantity){
        int index = ingredients.indexOf(ing); //find out the index
        quantities.set(index, newQuantity);
    }
    
    double computeCost(){
        double total = 0;
        for(int i=0; i < ingredients.size(); i++){
            total = total + ingredients.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }
    
    //returns the number of ingredients
    int getIngredientCount(){
        return ingredients.size();
    }
    
    //retrieves the i-th ingredient - a pointer to it
    Ingredient getIngredient(int i){
        return ingredients.get(i);
    }
    
    //retrives the quantity for the i-th ingredient
    double getQuantity(int i){
        return quantities.get(i);
    }
    
}
