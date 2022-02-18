package academy.mindswap;

public class Table {

    private static int counter;
    private int tableNumber;
    private boolean isFull;
    private boolean isPayed;


    public Table() {
        this.tableNumber = ++counter;

    }

    public boolean isTableFull(int[] areTheTablesOccupied, int i) {
        return this.isFull = (areTheTablesOccupied[i] == 1); //Se for verdadeiro retorna verdadeiro se nao falso
    }

    public boolean isTablePayed() {
        if (isFull) {
            return true;
        }return false;
    }
       /* if(areTheTablesOccupied[i] == 0){
        return false;
    } else {
            return true;
        }*/


    public int getTableNumber() {
        return tableNumber;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Table.counter = counter;
    }
}


