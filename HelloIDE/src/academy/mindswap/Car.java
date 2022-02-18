package academy.mindswap;

public class Car {

    //State
    String brand;
    String color;
    int fuelLevel;

    //Behaviour
    public void accelerate() {
        if (fuelLevel < 0) {
            System.out.println("No fuel");
            return;
        }
        fuelLevel--;
        System.out.println("Vroom");
    }
}