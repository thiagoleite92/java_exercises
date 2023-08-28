package list.task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

  private List<Task> taskList;

  public TaskList() {
    this.taskList = new ArrayList<>();
  }

  public void addTask(String description) {
    taskList.add(new Task(description));
  }

  public void removeTask(String description) {
    List<Task> tasksToRemove = new ArrayList<>();

    for (Task t : taskList) {
      if (t.getDescription().equalsIgnoreCase(description)) {
        tasksToRemove.add(t);
      }
    }

    taskList.removeAll(tasksToRemove);
  }

  public void countTasks() {
    System.out.println(taskList.size());
  }

  public void getTaskDescriptions() {
    System.out.println(taskList);
  }

  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    taskList.countTasks(); // 0
    taskList.addTask("Estudar java");

    taskList.countTasks(); // 1

    taskList.addTask("Continuar estudando");
    taskList.addTask("Continuar estudando");
    taskList.addTask("Task 1");

    taskList.countTasks(); //4

    taskList.getTaskDescriptions();

    taskList.removeTask("Continuar estudando");

    taskList.countTasks(); // 2
    taskList.getTaskDescriptions();
  }
}
