package set;

import java.util.HashSet;
import java.util.Set;

public class InviteSet {

  private Set<Invite> inviteSet;

  public InviteSet() {
    this.inviteSet = new HashSet<Invite>();
  }

  public void add(String name, int inviteCode) {
    inviteSet.add(new Invite(name, inviteCode));
  }

  public void removeByInviteCode(int inviteCode) {
    for (Invite i : inviteSet) {
      if (inviteCode == i.getInviteCode()) {
        inviteSet.remove(i);
        return;
      }
    }
  }

  public int countInvites() {
    return inviteSet.size();
  }

  public static void main(String[] args) {
    InviteSet inviteSet = new InviteSet();

    // Adicionar convites
    inviteSet.add("Alice", 123);
    inviteSet.add("Bob", 456);
    inviteSet.add("Charlie", 789);

    // Contar e exibir o número de convites
    System.out.println("Número de convites: " + inviteSet.countInvites());

    // Remover um convite pelo código do convite
    inviteSet.removeByInviteCode(456);

    // Contar e exibir o número atualizado de convites
    System.out.println(
      "Número de convites após remover: " + inviteSet.countInvites()
    );
  }
}
