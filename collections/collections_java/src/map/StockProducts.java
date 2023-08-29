package map;

import java.util.HashMap;
import java.util.Map;

public class StockProducts {

  private Map<Long, Product> stockMap;

  public StockProducts(Map<Long, Product> stockMap) {
    this.stockMap = new HashMap<>();
  }

  public void add(Long code, String name, Double price, Integer quantity) {
    stockMap.put(code, new Product(name, price, quantity));
  }

  public void showStock() {
    System.out.println(stockMap);
  }

  public Double calculateStockValue() {
    double totalValue = 0.0;
    if (!isStockEmpty()) {
      for (Product product : stockMap.values()) {
        totalValue += product.getQuantity() * product.getPrice();
      }
    }

    return totalValue;
  }

  public Product getMostExpensiveProduct() {
    Product produto = null;
    double biggerPrice = Double.MIN_VALUE;

    if (!isStockEmpty()) {
      for (Product product : stockMap.values()) {
        if (product.getPrice() > biggerPrice) {
          produto = product;
        }
      }
    }

    return produto;
  }

  private boolean isStockEmpty() {
    return stockMap.isEmpty();
  }

  public static void main(String[] args) {
    Map<Long, Product> stockMap = new HashMap<>();
    StockProducts stockProducts = new StockProducts(stockMap);

    stockProducts.add(1L, "Product A", 10.0, 5);
    stockProducts.add(2L, "Product B", 20.0, 10);
    stockProducts.add(3L, "Product C", 15.0, 7);

    System.out.println("Stock após adicionar produtos:");
    stockProducts.showStock();

    double stockValue = stockProducts.calculateStockValue();
    System.out.println("Valor total do estoque: " + stockValue);

    Product mostExpensiveProduct = stockProducts.getMostExpensiveProduct();
    if (mostExpensiveProduct != null) {
      System.out.println(
        "Produto mais caro: " +
        mostExpensiveProduct.getName() +
        " - Preço: " +
        mostExpensiveProduct.getPrice()
      );
    } else {
      System.out.println("Estoque vazio, nenhum produto mais caro.");
    }
  }
}
