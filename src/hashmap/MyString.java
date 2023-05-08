package hashmap;

public class MyString {
  private String data;

  public MyString(String data) {
    this.data = data;
  }

  public String getData() {
    return data;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    for(int i=0; i < this.data.length(); i++) {
      hash += data.charAt(i)*31;
    }
    return hash;
  }
}
