package academy.mindswap;

public class Motocycle extends Vehicle {

    public Motocycle(int idNumber, String brand) {
        super(brand, 30, 100);
    }

    @Override
    public void drive(int distance, int time) {
        if (distance > 80) {
            System.out.println("You can't drive so much distance");
            return;
        }
        super.drive(distance, time);
    }

}
