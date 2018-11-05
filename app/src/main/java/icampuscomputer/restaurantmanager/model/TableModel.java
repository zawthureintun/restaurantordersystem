package icampuscomputer.restaurantmanager.model;

public class TableModel {
    private String tableName;
    private int tableImage;

    public TableModel(String tableName, int tableImage) {
        this.tableName = tableName;
        this.tableImage = tableImage;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getTableImage() {
        return tableImage;
    }

    public void setTableImage(int tableImage) {
        this.tableImage = tableImage;
    }
}
