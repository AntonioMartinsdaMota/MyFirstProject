package academy.mindswap;

public abstract class Vehicle {

    private int fuelLevel;
    private static int idNumber = 1;
    private int fuelConsumption;
    private int maxSpeed;
    private String brand;
    private boolean clientPay;

    public void setClientPay(boolean clientPay) {
        this.clientPay = clientPay;
    }

    public boolean isClientPay() {
        return clientPay;
    }


    public Vehicle(String brand, int fuelConsumption, int maxSpeed) {
        this.fuelLevel = 25;
        this.idNumber = idNumber++;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.brand = brand;

    }

    public void drive(int distance, int time) {
        if (getNecessarySpeed(distance, time) > maxSpeed || distance > getRange() || fuelLevel == 0) {
            System.out.println("You can't drive!");
            return;
        }
        this.setFuelLevel(this.getFuelLevel() - (distance / fuelConsumption));
        System.out.println("You drove " + distance + " km in Motorcycle");
    }


    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getRange() {
        return fuelConsumption * fuelLevel;

    }

    public int getNecessarySpeed(int distance, int time) {
        return distance / time;

    }


    public int getIdNumber() {
        return idNumber;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void refuel() {
        setFuelLevel(25);
        System.out.println("Your tank is full");
    }

}
