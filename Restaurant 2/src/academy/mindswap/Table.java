package academy.mindswap;

public class Table {


    private int tableName;
    private boolean isTableFull;
    private boolean isTablePayed;

    public Table(int tableName) {
        this.tableName = tableName;
    }

    public int getTableName() {
        return tableName;
    }

    public boolean isTableFull() {
        return isTableFull;
    }

    public void setTableFull(boolean tableFull) {
        isTableFull = tableFull;
    }

    public boolean isTablePayed() {
        return isTablePayed;
    }

    public void setTablePayed(boolean tablePayed) {
        isTablePayed = tablePayed;
    }
}
