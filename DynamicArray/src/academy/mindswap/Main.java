package academy.mindswap;

public class Main {

    public static void main(String[] args) {


        int a = 1;
        Integer b = a;
        int c = b;
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add('A');
        dynamicArray.add(6);
        dynamicArray.add("Tony");
        dynamicArray.add(8);
        dynamicArray.printArray();

        try {
            dynamicArray.remove(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dynamicArray.printArray();

        dynamicArray.getLength();





    }
}
