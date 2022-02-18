package academy.mindswap;

public class Tires {

    private int integrity;
    private boolean isTireOk;


    public Tires(int integrity){
        this.integrity = integrity;
        this.isTireOk = true;
    }

    public Tires() {
        this.integrity = 800;
        this.isTireOk = true;
    }


    public int tireWear(int distance) {
        if (integrity - distance < 0) {
            return 0;
        }
        integrity -= distance;
         return integrity;

    }

    public void tireChange() {
        integrity = 800;
        isTireOk = true;

    }
}
