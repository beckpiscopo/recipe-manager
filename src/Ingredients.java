/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brittanybeckett-harrison
 */

public class Ingredients { 
    String ingredientName;
    String unitType;
    double unitSize; 
    
    public Ingredients(String ingredientName, String unitType, double unitSize) {
        this.ingredientName = ingredientName; 
        this.unitType = unitType; 
        this.unitSize = unitSize;
    }   
    //public getIngredientName() { 
       // return ingredientName;
    //}
    
    //public getunitType() {
      //  return unitType;
   // }
    
    
   // public getunitSize() {
       // return unitSize;
    //}
    
    public static Ingredients createIngredient(String ingredientName, String unitType, double unitSize) {
        return new Ingredients(ingredientName, unitType, unitSize);
    }
}
