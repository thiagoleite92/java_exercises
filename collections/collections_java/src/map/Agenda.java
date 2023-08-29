package map;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

  private Map<String, Integer> agenda;

  public Agenda() {
    this.agenda = new HashMap<>();
  }

  public void add(String name, Integer phone) {
    agenda.put(name, phone);
  }

  public void removeByName(String name) {
    if (!isAgendaEmpty()) {
      agenda.remove(name);
    } else {}
  }

  private boolean isAgendaEmpty() {
    return agenda.isEmpty();
  }

  public void showAgenda() {
    System.out.println(agenda);
  }

  public Integer findByName(String name) {
    Integer numberByName = null;
    if (!isAgendaEmpty()) {
      numberByName = agenda.get(name);
    }

    return numberByName;
  }

  public static void main(String[] args) {
    Agenda agenda = new Agenda();

    agenda.add("Alice", 123456789);
    agenda.add("Bob", 987654321);
    agenda.add("Charlie", 555555555);

    System.out.println("Agenda após adicionar contatos:");
    agenda.showAgenda();

    String nameToRemove = "Bob";
    agenda.removeByName(nameToRemove);
    System.out.println("Agenda após remover " + nameToRemove + ":");
    agenda.showAgenda();

    String nameToFind = "Alice";
    Integer numberFound = agenda.findByName(nameToFind);
    if (numberFound != null) {
      System.out.println("Número de " + nameToFind + ": " + numberFound);
    } else {
      System.out.println(nameToFind + " não encontrado na agenda.");
    }
  }
}
