package recipemanager;


public class Ingredient {
    String name;
    String unitOfMeasurement;
    double price;
    int recipeCount; // Counts # of recipes this ingredient is in
    
        public void addedToRecipe(){    //adds ingredient to recipe
        recipeCount++;
    }
    
    public void removedFromRecipe(){    //removes ingredient from recipe
        recipeCount--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
        @Override
    public String toString(){
        String star;
        
        if(recipeCount == 0)
            star = "*";
        else
            star = "";
        
        return star + name + " ($" + price +"/" + unitOfMeasurement + ")";
    }
}
