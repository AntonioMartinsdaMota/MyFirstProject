package academy.mindswap;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList {

   private Queue<Tasks> list;

    public ToDoList() {
        this.list = new PriorityQueue<>();

    }

    public boolean add(String item, int priority, Importance importance){
        return list.add(new Tasks(item,priority,importance));
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String remove(){
        return list.remove().item;
    }


    public class Tasks implements Comparable<Tasks>{

        private String item;
        private int priority;
        private Importance importance;

        public Tasks(String item, int priority, Importance importance) {
            this.item = item;
            this.priority = priority;
            this.importance = importance;
        }


        @Override
        public int compareTo(Tasks o) {
            int result = importance.compareTo(o.importance);
            if (result == 0){
                result = Integer.compare(priority,o.priority);
            }
            if(result == 0){
                result = item.compareTo(o.item);
            }
            return result;
        }
    }
}
