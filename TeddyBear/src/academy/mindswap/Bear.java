package academy.mindswap;

public class Bear {
    private String name;
    private int battery;

    public Bear(String name) {
        this.name = name;
        this.battery = 100;

    }

    public void talk(){
    if(battery > 0){
        System.out.println("I Love You");
        battery -= 20;
        return;
    }
        System.out.println("No Battery");
    }

    public String getName() {
        return name;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
