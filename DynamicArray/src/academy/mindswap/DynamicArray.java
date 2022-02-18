package academy.mindswap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    private int objectsCounter;

    private Object[] dynamicArray;

    public DynamicArray() {
        this.dynamicArray = new Object[2];
    }


    public Object[] add(Object object) {
        objectsCounter++;
        for (int i = 0; i < dynamicArray.length; i++) {
            if (dynamicArray[i] == null) {
                dynamicArray[i] = object;
                return dynamicArray;
            }
        }
        Object[] newArray = new Object[dynamicArray.length * 2];

        for (int i = 0; i < dynamicArray.length; i++) {
            newArray[i] = dynamicArray[i];
        }

        dynamicArray = newArray;

        for (int i = 0; i < dynamicArray.length; i++) {
            if (dynamicArray[i] == null) {
                dynamicArray[i] = object;
                return dynamicArray;
            }
        }

        return add(object);
    }


    public Object[] remove(int index) throws ArrayIndexOutOfBoundsException {

        if(index < 0 || index >= dynamicArray.length)
            throw new ArrayIndexOutOfBoundsException();

        dynamicArray[index] = null;

        for (int i = 0; i < dynamicArray.length - 1; i++) {
            if (dynamicArray[i] == null) {
                while (dynamicArray[i + 1] != null) {
                    Object temp = dynamicArray[i];
                    dynamicArray[i] = dynamicArray[i + 1];
                    dynamicArray[i + 1] = temp;
                    break;
                }
            }
        }
        dynamicArray[dynamicArray.length - 1] = null;
        objectsCounter--;
        reduceArray();
        return dynamicArray;
    }



    public Object[] reduceArray(){

        if (objectsCounter < dynamicArray.length/2){

        Object[] reducedArray = new Object[dynamicArray.length / 2];

            for (int d = 0; d < dynamicArray.length; d++) {
                if (dynamicArray[d] != null){
                    reducedArray[d] = dynamicArray[d];
                } else {
                    break;
                }
                dynamicArray = reducedArray;

            }
        }
        return dynamicArray;
    }


    public void printArray(){

        System.out.print("[");

        String a = "";

        for (Object object : this.dynamicArray){
            a += object + ", ";
        }

        String b = a.substring(0, a.length()-2);
        System.out.print( b + "]");
        System.out.println();
    }


    public void getLength(){
        System.out.println(objectsCounter);
   }

   /*public void trimArray(){

       List<Object> list = new ArrayList<>(Arrays.asList(dynamicArray));

       //ArrayList<Object> list1 = new ArrayList<>(Arrays.asList(dynamicArray));

       ((ArrayList)list).trimToSize();

       list.re



       System.out.println(list);



   }*/

}

