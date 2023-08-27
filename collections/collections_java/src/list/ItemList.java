package list;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

  private List<Item> itemList;

  public ItemList() {
    this.itemList = new ArrayList<>();
  }

  public void addItem(String name, int quantity, double price) {
    Item item = checkItemList(name);

    if (item instanceof Item) {
      removeItem(name);
      itemList.add(
        new Item(item.getName(), item.getQuantity() + quantity, item.getPrice())
      );
    } else {
      itemList.add(new Item(name, quantity, price));
    }
  }

  public void removeItem(String name) {
    this.itemList.removeIf(item -> item.getName() == name);
  }

  public double calcTotalValue() {
    double total = 0.0;
    for (Item item : this.itemList) {
      total += item.getPrice();
    }

    return total;
  }

  private Item checkItemList(String name) {
    for (Item item : itemList) {
      if (item.getName().equalsIgnoreCase(name)) {
        return item;
      }
    }
    return null;
  }

  public List<Item> getItemList() {
    return itemList;
  }

  public static void main(String[] args) {
    ItemList itemList = new ItemList();

    itemList.addItem("Item1", 2, 10.0);
    itemList.addItem("Item2", 3, 15.0);
    itemList.addItem("Item1", 1, 10.0);

    System.out.println("Items in the list:");
    for (Item item : itemList.getItemList()) {
      System.out.println(
        item.getName() +
        " - Quantity: " +
        item.getQuantity() +
        " - Price: " +
        item.getPrice()
      );
    }

    System.out.println("Total Value: " + itemList.calcTotalValue());
  }
}
