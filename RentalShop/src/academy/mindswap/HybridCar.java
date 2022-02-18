
package academy.mindswap;

public class HybridCar extends Vehicle {

    private int batteryPower;
    private int batteryConsumption;


    public HybridCar(int idNumber, String brand) {
        super(brand, 50, 120);
        this.batteryPower = 100;
        this.batteryConsumption = 1; // consumo por km

    }

    @Override
    public void drive(int distance, int time) {
        if (getNecessarySpeed(distance, time) >= 25 || necessaryBattery(distance) > batteryPower || batteryPower == 0) {
            super.drive(distance, time);
            System.out.println("You drove " + distance + " km in Normal Mode");
            return;
        }
        batteryPower -= necessaryBattery(distance);
        System.out.println("You drove " + distance + " km in Battery Mode");

    }

    public int necessaryBattery(int distance) {
        return distance * this.batteryConsumption;

    }

    public int getBatteryPower() {
        return this.batteryPower;
    }

    public void rechargeBattery() {
        this.batteryPower = 100;
        System.out.println("Your battery is full");
    }


}