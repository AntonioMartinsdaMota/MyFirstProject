package academy.mindswap;

public class RentalShop {

    private Vehicle[] arrayOfVehicle;
    private int[] arrayVehicleId;
    private int shopCapacity;
    private int vehicleCounter;
    private double amount;


    public RentalShop(int shopCapacity) {
        this.shopCapacity = shopCapacity;
        this.arrayOfVehicle = new Vehicle[shopCapacity];
        this.arrayVehicleId = new int[shopCapacity];
        this.vehicleCounter = 0;
    }

    public int getVehicleCounter() {
        return vehicleCounter;
    }

    public Vehicle[] getArrayOfVehicle() {
        return arrayOfVehicle;
    }

    public void buyVehicle(VehicleTypes vehicleTypes, String brand) {

        if (vehicleCounter < shopCapacity) {
            switch (vehicleTypes) {
                case CAR:
                    NormalCar car = new NormalCar(vehicleCounter, brand);
                    System.out.println("You have bought a car");
                    arrayOfVehicle[vehicleCounter] = car;
                    arrayVehicleId[vehicleCounter] = car.getIdNumber();
                    vehicleCounter++;
                    break;
                case HYBRID:
                    HybridCar hybrid = new HybridCar(vehicleCounter, brand);
                    System.out.println("You have bought a hybrid");
                    arrayOfVehicle[vehicleCounter] = hybrid;
                    arrayVehicleId[vehicleCounter] = hybrid.getIdNumber();
                    vehicleCounter++;
                    break;
                case MOTOCYCLE:
                    Motocycle motocycle = new Motocycle(vehicleCounter, brand);
                    System.out.println("You have bought a motocycle");
                    arrayOfVehicle[vehicleCounter] = motocycle;
                    arrayVehicleId[vehicleCounter] = motocycle.getIdNumber();
                    vehicleCounter++;
                    break;
            }
        } else {
            System.out.println("Your shop is already full!");
        }
    }


    public Vehicle renting(VehicleTypes vehicleTypes) {

        switch (vehicleTypes) {
            case CAR:
                for (int i = 0; i < arrayOfVehicle.length; i++) {
                    if (arrayOfVehicle[i] instanceof NormalCar) {
                        NormalCar car = (NormalCar) arrayOfVehicle[i];
                        arrayOfVehicle[i] = null;
                        return car;
                    }
                }
            case HYBRID:
                for (int i = 0; i < arrayOfVehicle.length; i++) {
                    if (arrayOfVehicle[i] instanceof HybridCar) {
                        HybridCar hybrid = (HybridCar) arrayOfVehicle[i];
                        arrayOfVehicle[i] = null;
                        return hybrid;
                    }
                }
            case MOTOCYCLE:
                for (int i = 0; i < arrayOfVehicle.length; i++) {
                    if (arrayOfVehicle[i] instanceof Motocycle) {
                        Motocycle motocycle = (Motocycle) arrayOfVehicle[i];
                        arrayOfVehicle[i] = null;
                        return motocycle;
                    }
                }
        }
        System.out.println("I can't find your vehicle type: " + vehicleTypes);

        return null;
    }

    public void returning(Vehicle vehicle) {

        if (!checkIfIsFromThisShop(vehicle)) {
            System.out.println("This vehicle is not from this Shop");
            return;
        }
        if (vehicle.getFuelLevel() >= 20) {
            for (int i = 0; i < arrayOfVehicle.length; i++) {
                if (arrayOfVehicle[i] == null) {
                    arrayOfVehicle[i] = vehicle;
                    return;
                }
            }
        }

        if (vehicle.isClientPay()) {
            for (int i = 0; i < arrayOfVehicle.length; i++) {
                if (arrayOfVehicle[i] == null) {
                    arrayOfVehicle[i] = vehicle;
                    return;

                }
            }
        }
        amount = ((20 - vehicle.getFuelLevel()) * 1.5);
        System.out.println("You must pay " + amount + " €");
    }

    public double getAmount() {
        return amount;
    }

    public boolean checkIfIsFromThisShop(Vehicle vehicle) {
        for (int i = 0; i < arrayVehicleId.length; i++) {
            if (arrayVehicleId[i] == vehicle.getIdNumber()) {
                return true;
            }
        }
        return false;
    }
}