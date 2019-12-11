import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {
        ArrayList<Task> todoList = new ArrayList<Task>();

        todoList.add(new Task("ComSci Test", 10));
        todoList.add(new Task("US History Quest", 1));

        for (Task x : todoList) {
            System.out.println(x);
        }

        todoList.get(1).setPriority(9);
        
        for (Task x : todoList) {
            System.out.println(x.getPriority());
        }
    }
}