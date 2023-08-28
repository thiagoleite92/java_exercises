package list.task;

public class Task {

  private String description;

  public Task(String description) {
    this.description = description;
  }

  /**
   * @return String return the description
   */
  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return description;
  }
}
