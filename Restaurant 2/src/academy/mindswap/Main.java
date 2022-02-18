package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant(3);

        Client client1 = new Client("Antonio");
        Client client2 = new Client("Bruna");
        Client client3 = new Client("Carlos");

        client1.joinRestaurant(restaurant1);
        client2.joinRestaurant(restaurant1);
        client3.joinRestaurant(restaurant1);

        client1.sit();



        client1.pay();
        client2.pay();
        client1.pay();














	// write your code here
    }
}
