package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant(5);
        // write your code here
        Client client1 = new Client("Antonio");
        Client client2 = new Client("Joao");
        Client client3 = new Client("Diogo");
        Client client4 = new Client("Pedro");
        Client client5 = new Client("Rui");
        Client client6 = new Client("Luis");


        restaurant1.sitClient(client1);
        restaurant1.sitClient(client2);
        restaurant1.sitClient(client3);
        restaurant1.sitClient(client4);
        restaurant1.sitClient(client5);
        restaurant1.sitClient(client6);




        Restaurant restaurant2 = new Restaurant(3);
        // write your code here
        Client client7 = new Client("Maria");
        Client client8 = new Client("Ana");
        Client client9 = new Client("Tania");
        Client client10 = new Client("Jessica");

        restaurant2.sitClient(client7);
        restaurant2.sitClient(client8);
        restaurant2.sitClient(client9);
        restaurant2.sitClient(client10);


        restaurant1.payClient(2);
        restaurant1.sitClient(client10);

        restaurant2.payClient(2);
        restaurant2.payClient(2);

    }
}

