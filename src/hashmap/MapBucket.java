package hashmap;

import java.util.LinkedList;
import java.util.List;

public class MapBucket {
  private List<KeyValueEntry> kvList;

  public MapBucket () {
    if (kvList == null) {
      kvList = new LinkedList<>();
    }
  }

  public List<KeyValueEntry> getEntries() {
    return kvList;
  }

  public void addEntry(KeyValueEntry kve) {
    this.kvList.add(kve);
  }

  public void removeEntry(KeyValueEntry kve) {
    this.kvList.remove(kve);
  }
}