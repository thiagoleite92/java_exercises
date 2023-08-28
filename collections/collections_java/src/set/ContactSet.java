package set;

import java.util.HashSet;
import java.util.Set;

public class ContactSet {

  Set<Contact> contactSet;

  public ContactSet() {
    this.contactSet = new HashSet<Contact>();
  }

  public void addContact(String name, int phoneNumber) {
    contactSet.add(new Contact(name, phoneNumber));
  }

  public void showContacts() {
    System.out.println(contactSet);
  }

  public Set<Contact> findManyByName(String name) {
    Set<Contact> contactsByName = new HashSet<>();

    for (Contact c : contactSet) {
      if (c.getName().startsWith(name)) {
        contactsByName.add(c);
      }
    }

    return contactsByName;
  }

  public Contact updatePhoneNumber(String name, int newPhoneNumber) {
    Contact contatoAtualizado = null;

    for (Contact c : contactSet) {
      if (c.getName().equalsIgnoreCase(name)) {
        contatoAtualizado = c;
        contatoAtualizado.setPhoneNumber(newPhoneNumber);
        break;
      }
    }

    return contatoAtualizado;
  }

  public static void main(String[] args) {
    ContactSet contactSet = new ContactSet();

    // Adicionar contatos
    contactSet.addContact("Alice", 123456789);
    contactSet.addContact("Bob", 987654321);
    contactSet.addContact("Charlie", 555555555);

    // Mostrar contatos
    System.out.println("Lista de contatos:");
    contactSet.showContacts();

    // Procurar contatos pelo nome
    String searchName = "Al";
    Set<Contact> foundContacts = contactSet.findManyByName(searchName);
    System.out.println(
      "Contatos encontrados com o nome que começa com '" + searchName + "':"
    );
    for (Contact c : foundContacts) {
      System.out.println(c);
    }

    // Atualizar o número de telefone
    String contactToUpdate = "Bob";
    int newPhoneNumber = 111111111;
    Contact updatedContact = contactSet.updatePhoneNumber(
      contactToUpdate,
      newPhoneNumber
    );
    System.out.println("Contato atualizado: " + updatedContact);

    // Mostrar contatos novamente após a atualização
    System.out.println("Lista de contatos após a atualização:");
    contactSet.showContacts();
  }
}
