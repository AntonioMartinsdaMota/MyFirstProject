package academy.mindswap;

public class Restaurant {

    private int numberOfTables;
    private Table[] arrayOfTables;

    public Restaurant(int numberOfTables) {


        this.numberOfTables = numberOfTables;
        this.arrayOfTables = new Table[numberOfTables];

        for (int i = 0; i < arrayOfTables.length; i++) {
            arrayOfTables[i] = new Table(i);
            System.out.println(arrayOfTables[i].getTableName());
        }


    }


    public boolean checkAvailability() {

        for (Table table : arrayOfTables) {
            if (table.isTableFull() == false) {
                return true;
            }

        }
        return false;
    }

    public int sitClient() {

        if (checkAvailability() == false) {
            System.out.println("Restaurant is Full");
            return -1;
        }
            for (int i = 0; i < arrayOfTables.length; i++) {
                if (!arrayOfTables[i].isTableFull()) {
                    arrayOfTables[i].setTableFull(true);

                    System.out.println( " please sit in Table: " + arrayOfTables[i].getTableName());
                    return i;
                }

            }
        return -1;

    }
    public void payTable(int tableNumber) {

        if (tableNumber == -1){
            System.out.println("You dont have a Table");
            return;
        }
        if (arrayOfTables[tableNumber] == null || arrayOfTables[tableNumber].isTablePayed() == true) {
            System.out.println("you cant pay this table");
            return;
        }

        arrayOfTables[tableNumber].setTablePayed(true);
        System.out.println("you payed table: " + tableNumber);

    }
}

