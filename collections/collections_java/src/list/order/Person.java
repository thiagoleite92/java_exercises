package list.order;

import java.util.Comparator;

public class Person implements Comparable<Person> {

  private String name;
  private Integer age;
  private Double height;

  public Person(String name, Integer age, Double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return name + " - " + height + " - " + age;
  }

  @Override
  public int compareTo(Person person) {
    return Integer.compare(age, person.getAge());
  }
}

class ComparetorByHeight implements Comparator<Person> {

  @Override
  public int compare(Person p1, Person p2) {
    return Double.compare(p1.getHeight(), p2.getHeight());
  }
}
