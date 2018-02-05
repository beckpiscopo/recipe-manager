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
    public String getIngredientName() { 
        return ingredientName;
    }
    
    public String getunitType() {
      return unitType;
    }
    
  
   public Double getunitSize() {
       return unitSize;
    }
   
      public void setIngredientName(String ingredientName) { 
            this.ingredientName = ingredientName; 
    }  
    
    public static Ingredients createIngredient(String ingredientName, String unitType, double unitSize) {
        return new Ingredients(ingredientName, unitType, unitSize);
    }
}
