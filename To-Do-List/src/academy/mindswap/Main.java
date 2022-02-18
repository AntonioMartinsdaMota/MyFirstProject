package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

       toDoList.add("Eggs", 1, Importance.MEDIUM);
       toDoList.add("Cheese", 2, Importance.HIGH);
       toDoList.add("Ham", 3, Importance.HIGH);
       toDoList.add("Onion", 2, Importance.MEDIUM);
       toDoList.add("Flowers", 1, Importance.LOW);
       toDoList.add("Bacon", 3, Importance.MEDIUM);
       toDoList.add("Milk", 1, Importance.LOW);


    while (!toDoList.isEmpty()){
        System.out.println(toDoList.remove());
    }

    }
}
