package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Engine engine = new Engine();
        Engine engine1 = new Engine();


        Car car = new Car("Tata", new Tires(), new Radio(), engine);

      //  car.accelerate(20);
        //  car.accelerate(80);
       // car.accelerate(10);
        //car.getRefuelled();
        car.accelerate(50);
        car.accelerate(25);
        car.accelerate(5);

    }
}
