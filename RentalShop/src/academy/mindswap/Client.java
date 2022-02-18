package academy.mindswap;

public class Client {
    private String name;
    private Vehicle vehicle;
    private boolean hasACar;


    public Client(String name) {
        this.name = name;
    }

    public void rentCar(RentalShop shop, VehicleTypes vehicleTypes) {
        vehicle = shop.renting(vehicleTypes);
        hasACar = true;
        System.out.println("You rented a " + vehicleTypes);
    }

    public void returnCar(RentalShop shop) {
        if (hasACar && vehicle.isClientPay() && shop.checkIfIsFromThisShop(vehicle)) {
            shop.returning(vehicle);
            vehicle = null;
            hasACar = false;
            System.out.println("You returned your vehicle");
            return;

        }
        if (!hasACar) {
            System.out.println("Please, rent a car first!");
            return;
        }
        shop.returning(vehicle);

    }

    public void pay(double amount, RentalShop shop) {
        if (!shop.checkIfIsFromThisShop(vehicle)){
            System.out.println("We cant accept your payment on this shop");
        }

        if (amount == shop.getAmount() && shop.checkIfIsFromThisShop(vehicle)) {
            vehicle.setClientPay(true);
            System.out.println("You have completed your payment");
            return;
        }
        if (amount != shop.getAmount() && shop.checkIfIsFromThisShop(vehicle)) {
            System.out.println("Please insert the correct amount: " + shop.getAmount());
            return;
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
