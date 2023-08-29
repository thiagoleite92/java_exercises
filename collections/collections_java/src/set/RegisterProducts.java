package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProducts {

  private Set<Product> productSet;

  public RegisterProducts() {
    this.productSet = new HashSet<Product>();
  }

  public void register(long code, String name, double price, int quantity) {
    productSet.add(new Product(name, price, code, quantity));
  }

  public Set<Product> showProductsByName(String name) {
    Set<Product> productsByName = new TreeSet<Product>(productSet);

    return productsByName;
  }

  public Set<Product> showProductsByPrice(Double price) {
    Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());

    productsByPrice.addAll(productSet);

    return productsByPrice;
  }

  public static void main(String[] args) {
    RegisterProducts register = new RegisterProducts();

    // Register some products
    register.register(1, "Product A", 10.0, 5);
    register.register(2, "Product B", 15.0, 3);
    register.register(3, "Product C", 20.0, 7);

    // Show products by name
    Set<Product> productsByName = register.showProductsByName("Product A");
    System.out.println("Products with name 'Product A':");
    for (Product product : productsByName) {
      System.out.println(product);
    }

    // Show products by price
    Set<Product> productsByPrice = register.showProductsByPrice(15.0);
    System.out.println("Products with price $15.0 or less:");
    for (Product product : productsByPrice) {
      System.out.println(product);
    }
  }
}
