/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class FoodDirectory {
  private ArrayList<Food> foodList;
 public FoodDirectory(){
     foodList = new ArrayList<>();
 }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public Food addFood(String foodName, float money,String ingredients,int discount){
        Food food = new Food();
        food.setFoodName(foodName);
        food.setMoney(money);
        food.setIngredients(ingredients);
        food.setDiscount(discount);
        foodList.add(food);
        return food;
    }
 
}
    