package icampuscomputer.restaurantmanager.model;

public class FoodMenuModel {
    String food_name;
    int food_qty;

    public FoodMenuModel(String food_name, int food_qty) {
        this.food_name = food_name;
        this.food_qty = food_qty;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getFood_qty() {
        return food_qty;
    }

    public void setFood_qty(int food_qty) {
        this.food_qty = food_qty;
    }
}
