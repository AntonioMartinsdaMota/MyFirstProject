package academy.mindswap;

public class Client {

    private String name;
    private int tableNumber;
    private Restaurant restaurant;
    private boolean isClientSit;


    public Client(String name) {
        this.name = name;
        isClientSit = false;
        tableNumber= -1;

    }

    public String getName() {
        return name;
    }

    public void joinRestaurant(Restaurant restaurant) {
        if(restaurant.checkAvailability())
        this.restaurant = restaurant;
    }

    public boolean isClientSit() {
        return isClientSit;
    }

    public void setClientSit(boolean clientSit) {
        isClientSit = clientSit;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void sit() {
        if(restaurant != null){
         this.tableNumber = restaurant.sitClient();
        }
    }

    public void pay() {
        if(restaurant != null){
            restaurant.payTable(tableNumber);
        }
    }

}
