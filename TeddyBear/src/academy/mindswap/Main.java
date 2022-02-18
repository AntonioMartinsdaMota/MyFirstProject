package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop();
        Shop shop2 = new Shop();


        // Creates 6 bears in Shop 1

        Bear bear1 = shop1.createBear();
        Bear bear2 = shop1.createBear();
        Bear bear3 = shop1.createBear();
        Bear bear4 = shop1.createBear();
        Bear bear5 = shop1.createBear();
        Bear bear6 = shop1.createBear();


        //Creates 3 Bears in Shop 2

        Bear bear7 = shop1.createBear();
        Bear bear8 = shop1.createBear();
        Bear bear9 = shop1.createBear();



        // Drunk Bear:

        bear1.talk(); // Talks, but has a 0.2 of probability of falling asleep. if falls a sleep will snore until battery is 0
        bear1.talk();
        bear1.talk();
        bear1.talk();
        bear1.talk();
        bear1.talk();
        bear1.talk();

        System.out.println("\n");

        // Simple Bear:

        bear2.talk(); // Talks ang uses 20 of Battery / Battery changes to 80.
        bear2.talk(); // ""                           / Battery changes to 60.
        bear2.talk(); // ""                           / Battery changes to 40.
        bear2.talk(); // ""                           / Battery changes to 20.
        bear2.talk(); // ""                           / Battery changes to 0.
        bear2.talk(); //  No Power, can't talk        / No Battery!!!!


        System.out.println("\n");

        // Cranky Bear:

        bear5.talk(); // Bear talks!
        ((CrankyBear)bear5).sing(); //Cant sing because it has more than 50€ of battery!
        bear5.talk(); // Bear talks!
        bear5.talk(); // Bear talks! and gets battery lower than 50, so next time can sing.
        ((CrankyBear)bear5).sing(); //Sings!
        ((CrankyBear)bear5).sing(); //Cant sing because already sang 1 time!
        bear5.talk();



        System.out.println(("\n"));

      // Compare Shops:


        if(shop1.getBearsCounter() > shop2.getBearsCounter()){
            System.out.println("Shop1 has: " + shop1.getBearsCounter() + " bears  and  Shop2 has: " + shop2.getBearsCounter()
                    + " bears\nShop 1 wins");
            return;
        }

        if(shop1.getBearsCounter() < shop2.getBearsCounter()){
             System.out.println("Shop1 has: " + shop1.getBearsCounter() + " bears  and  Shop2 has: " + shop2.getBearsCounter()
            + " bears\nShop 2 wins");;
            return;
        }
        if(shop1.getBearsCounter() == shop2.getBearsCounter()){
            System.out.println("Shop1 has: " + shop1.getBearsCounter() + " bears  and  Shop2 has: " + shop2.getBearsCounter()
                    + " bears\nIt's a Draw");

        }
    }
}
