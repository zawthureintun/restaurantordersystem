package icampuscomputer.restaurantmanager.model;

public class FoodCatogoryModel {
    int foodId;
    String foodName;

    public FoodCatogoryModel(int foodId, String foodName) {
        this.foodId = foodId;
        this.foodName = foodName;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
