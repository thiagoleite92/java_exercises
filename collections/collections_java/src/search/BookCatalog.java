package search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

  private List<Book> bookList;

  public BookCatalog() {
    this.bookList = new ArrayList<>();
  }

  void addBook(String author, String title, int year) {
    bookList.add(new Book(author, title, year));
  }

  public List<Book> findByAuthor(String author) {
    List<Book> booksByAuthor = new ArrayList<>();

    if (!bookList.isEmpty()) {
      for (Book book : bookList) {
        if (book.getAuthor().equalsIgnoreCase((author))) {
          booksByAuthor.add(book);
        }
      }
    }

    return booksByAuthor;
  }

  public List<Book> findByYearInterval(int startYear, int endYear) {
    List<Book> booksByYearInterval = new ArrayList<>();
    if (!bookList.isEmpty()) {
      for (Book book : bookList) {
        if (book.getYear() >= startYear && book.getYear() <= endYear) {
          booksByYearInterval.add(book);
        }
      }
    }

    return booksByYearInterval;
  }

  public Book findBookByTitle(String title) {
    Book bookByTitle = null;

    if (!bookList.isEmpty()) {
      for (Book book : bookList) {
        if (book.getTitle().equalsIgnoreCase(title)) {
          bookByTitle = book;
          break;
        }
      }
    }
    return bookByTitle;
  }

  public static void main(String[] args) {
    BookCatalog catalog = new BookCatalog();

    catalog.addBook("Author1", "Book A", 2000);
    catalog.addBook("Author2", "Book B", 2010);
    catalog.addBook("Author1", "Book C", 2005);
    catalog.addBook("Author3", "Book D", 2015);

    // Test findByAuthor
    List<Book> booksByAuthor = catalog.findByAuthor("Author1");
    System.out.println("Books by Author1:");
    for (Book book : booksByAuthor) {
      System.out.println(book.getTitle() + " (" + book.getYear() + ")");
    }

    // Test findByYearInterval
    List<Book> booksByYearInterval = catalog.findByYearInterval(2000, 2010);
    System.out.println("\nBooks between 2000 and 2010:");
    for (Book book : booksByYearInterval) {
      System.out.println(book.getTitle() + " (" + book.getYear() + ")");
    }

    // Test findBookByTitle
    Book bookByTitle = catalog.findBookByTitle("Book D");
    if (bookByTitle != null) {
      System.out.println(
        "\nBook found: " +
        bookByTitle.getTitle() +
        " (" +
        bookByTitle.getYear() +
        ")"
      );
    } else {
      System.out.println("\nBook not found.");
    }
  }
}
