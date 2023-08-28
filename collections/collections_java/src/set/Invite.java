package set;

public class Invite {

  private String name;
  int inviteCode;

  public Invite(String name, int inviteCode) {
    this.name = name;
    this.inviteCode = inviteCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(int inviteCode) {
    this.inviteCode = inviteCode;
  }

  @Override
  public String toString() {
    return name + " + " + inviteCode;
  }
}
