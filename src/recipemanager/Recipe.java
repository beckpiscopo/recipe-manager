/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipemanager;

import java.util.ArrayList;


public class Recipe {
    String name;
    ArrayList<Ingredient> ingredients;
    ArrayList<Double> quantities;
    
    public Recipe(){
        ingredients = new ArrayList<>();
        quantities = new ArrayList<>();
    }
    
    public int getNumberOfIngredients(){
        return ingredients.size();
    }
    
    //returns the i-th ingredient
    public Ingredient getIngredient(int i){
        return ingredients.get(i);
    }

    //returns the quantity for the i-th ingredient
    public double getQuantity(int i){
        return quantities.get(i);
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
        
        ing.addedToRecipe(); //do not forget to tell the ingredient it's been added
    }
    
    public void removeIngredient(int index){ //no error checking on index being valid
        Ingredient ing = ingredients.get(index);
        ing.removedFromRecipe(); //do not forget to tell the ingredient it's out
        
        ingredients.remove(index);
        quantities.remove(index);
        
    }
    
    public void removeIngredient(Ingredient ing){
        int index = ingredients.indexOf(ing); //find out the index
        
        if(index != -1)
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
    
    @Override
    public String toString(){
        
        //first add the names of all ingredients in a string
        String names = "";
        for(int i=0; i < ingredients.size(); i++){
            names = names + ingredients.get(i).getName() + ", ";
        }
        //done
        
        
        return name + ", $" + computeCost() + " (" + names + ")";
    }
    
}
