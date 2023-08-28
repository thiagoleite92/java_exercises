package list.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrder {

  List<Person> personList;

  public PeopleOrder() {
    this.personList = new ArrayList<Person>();
  }

  public void addPerson(String name, int age, double height) {
    personList.add(new Person(name, age, height));
  }

  public List<Person> orderByAge() {
    List<Person> listByAge = new ArrayList<Person>(personList);

    Collections.sort(listByAge);

    return listByAge;
  }

  public List<Person> orderByHeight() {
    List<Person> listByHeight = new ArrayList<Person>(personList);

    Collections.sort(listByHeight, new ComparetorByHeight());

    return listByHeight;
  }

  public static void main(String[] args) {
    PeopleOrder peopleOrder = new PeopleOrder();

    peopleOrder.addPerson("Alice", 25, 165.5);
    peopleOrder.addPerson("Bob", 30, 175.0);
    peopleOrder.addPerson("Carol", 22, 160.0);
    peopleOrder.addPerson("David", 28, 180.0);

    System.out.println("\nOrdenado por idade:");
    List<Person> orderByAge = peopleOrder.orderByAge();
    for (Person person : orderByAge) {
      System.out.println(person);
    }

    System.out.println("\nOrdenado por altura:");
    List<Person> orderByHeight = peopleOrder.orderByHeight();
    for (Person person : orderByHeight) {
      System.out.println(person);
    }
  }
}
