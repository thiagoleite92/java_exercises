package set;

import java.util.Objects;

public class Contact {

  private String name;
  private int phoneNumber;

  public Contact(String name, int phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;

    if (!(obj instanceof Contact contact)) return false;

    return Objects.equals(getName(), contact.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }
}
