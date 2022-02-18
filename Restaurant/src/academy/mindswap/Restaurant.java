package academy.mindswap;

import java.lang.annotation.Target;

public class Restaurant {
    private int numberOfTables;
    private Table[] tablesArray;
    private int[] areTheTablesOccupied;



    public Restaurant(int numberOfTables) {
        Table.setCounter(0);
        this.numberOfTables = numberOfTables;
        this.tablesArray = new Table[numberOfTables];
        allocateTablesArray();
        for (int i = 0; i < tablesArray.length ; i++) {
            System.out.println("Table Number:  " + tablesArray[i].getTableNumber());
        }
        this.areTheTablesOccupied = new int[numberOfTables];
    }

    public void allocateTablesArray(){
        for (int i = 0; i < tablesArray.length; i++) {
            tablesArray[i] = new Table();
        }

    }

    public void sitClient(Client client){
        for (int i = 0; i <areTheTablesOccupied.length ; i++) {
            if(!tablesArray[i].isTableFull(areTheTablesOccupied, i)){
                areTheTablesOccupied[i] = 1;
                System.out.println("Hello " + client.getName() + "!, Please sit in table " + tablesArray[i].getTableNumber());
                return;
            }

        }
        System.out.println("Hello " + client.getName() +"! We are full, please go away!");

    }

   public void payClient(int tableNumber) {
       if (tablesArray[tableNumber].isTableFull(areTheTablesOccupied, tableNumber)){
           areTheTablesOccupied[tableNumber] = 0;
       System.out.println("You can Leave");
   } else {
           System.out.println("Table is Empty");
       }

   }




   // }


}

