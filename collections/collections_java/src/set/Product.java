package set;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

  private String name;
  private Double price;
  private long code;
  private int quantity;

  public Product(String name, Double price, long code, int quantity) {
    this.name = name;
    this.price = price;
    this.code = code;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public long getCode() {
    return code;
  }

  public void setCode(long code) {
    this.code = code;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return (
      "Product [name=" +
      name +
      ", price=" +
      price +
      ", code=" +
      code +
      ", quantity=" +
      quantity +
      "]"
    );
  }

  @Override
  public int compareTo(Product product) {
    return name.compareToIgnoreCase(product.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCode());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Product other = (Product) obj;
    if (code != other.code) return false;
    return true;
  }
}

class ComparatorByPrice implements Comparator<Product> {

  @Override
  public int compare(Product p1, Product p2) {
    return Double.compare(p1.getPrice(), p2.getPrice());
  }
}
