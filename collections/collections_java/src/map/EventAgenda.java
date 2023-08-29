package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventAgenda {

  private Map<LocalDate, Event> events;

  public EventAgenda() {
    this.events = new HashMap<>();
  }

  public void addEvent(LocalDate date, String name, String act) {
    Event event = new Event(name, act);

    events.put(date, event);
  }

  public void showAgenda() {
    Map<LocalDate, Event> orderedEvents = new TreeMap<>(events);

    System.out.println(orderedEvents);
  }

  public void showNextEvent() {
    LocalDate actualDate = LocalDate.now();

    for (Map.Entry<LocalDate, Event> entry : events.entrySet()) {
      if (
        entry.getKey().isEqual(actualDate) || entry.getKey().isAfter(actualDate)
      ) {
        System.out.println(
          "O pro´ximo evento: " +
          entry.getValue() +
          " acontecerá na data " +
          entry.getKey()
        );
        break;
      }
    }
  }

  public static void main(String[] args) {
    EventAgenda eventAgenda = new EventAgenda();

    eventAgenda.addEvent(LocalDate.of(2023, 8, 30), "Concert", "Band A");
    eventAgenda.addEvent(LocalDate.of(2023, 9, 15), "Festival", "Artist B");
    eventAgenda.addEvent(LocalDate.of(2023, 10, 5), "Live Show", "Band C");

    System.out.println("Agenda de Eventos:");
    eventAgenda.showAgenda();

    System.out.println("\nPróximo Evento:");
    eventAgenda.showNextEvent();
  }
}
