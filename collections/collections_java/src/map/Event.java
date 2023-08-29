package map;

public class Event {

  private String name;
  private String act;

  public Event(String name, String act) {
    this.name = name;
    this.act = act;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAct() {
    return act;
  }

  public void setAct(String act) {
    this.act = act;
  }

  @Override
  public String toString() {
    return "Event [name=" + name + ", act=" + act + "]";
  }
}
