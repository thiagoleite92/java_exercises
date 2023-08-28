package list.search;

import java.util.ArrayList;
import java.util.List;

public class NumbersSum {

  List<Integer> numbers = new ArrayList<Integer>();

  void addNumber(Integer number) {
    numbers.add(number);
  }

  private boolean checkList() {
    return !numbers.isEmpty();
  }

  public Integer calculateSum() {
    Integer total = 0;
    if (checkList()) {
      for (Integer number : numbers) {
        total += number;
      }
    }

    return total;
  }

  public Integer findBiggestNumber() {
    Integer total = 0;

    if (checkList()) {
      for (Integer number : numbers) {
        if (number > total) {
          total = number;
        }
      }
    }

    return total;
  }

  public Integer findSmallestNumber() {
    Integer total = findBiggestNumber();
    if (checkList()) {
      for (Integer number : numbers) {
        if (number < total) {
          total = number;
        }
      }
    }

    return total;
  }

  public void showNumbers() {
    System.out.println(numbers);
  }

  public static void main(String[] args) {
    NumbersSum numbersSum = new NumbersSum();

    numbersSum.addNumber(10);
    numbersSum.addNumber(5);
    numbersSum.addNumber(8);
    numbersSum.addNumber(3);
    numbersSum.addNumber(15);
    numbersSum.addNumber(2);
    numbersSum.addNumber(7);

    System.out.println("Lista de números:");
    numbersSum.showNumbers();

    System.out.println("Soma dos números: " + numbersSum.calculateSum());

    System.out.println("Maior número: " + numbersSum.findBiggestNumber());

    System.out.println("Menor número: " + numbersSum.findSmallestNumber());
  }
}
