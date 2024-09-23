package joe;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> toDoItemArrayList;

    public TaskList() {
        this.toDoItemArrayList = new ArrayList<Task>();
    }

    public void addToList(Task task) {
        this.toDoItemArrayList.add(task);
        UI.printReply(task.getItemDescription(), "Added: ");
    }

    public void loadToList(Task task) {
        this.toDoItemArrayList.add(task);
    }

    public void deleteFromList(int toDoNumber) {
        Task itemToDelete = toDoItemArrayList.get(toDoNumber -1);
        this.toDoItemArrayList.remove(toDoNumber - 1);
        UI.printReply(itemToDelete.toString(), "Deleted:");
    }

    public void markTask(int toDoNumber) {
        this.toDoItemArrayList.get(toDoNumber - 1).setToDo(true);
        UI.printReply(Integer.toString(toDoNumber), "Marked: ");
    }

    public void unmarkTask(int toDoNumber) {
        this.toDoItemArrayList.get(toDoNumber - 1).setToDo(false);
        UI.printReply(Integer.toString(toDoNumber), "Unmarked: ");
    }

    public int size() {
        return this.toDoItemArrayList.size();
    }

    public String toTaskString(int toDoNumber) {
        return this.toDoItemArrayList.get(toDoNumber - 1).toString();
    }
}
