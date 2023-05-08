package hashmap;

import java.util.Objects;

public class HashMapExample<K, V> {
  private final int CAPACITY = 19891;
  private MapBucket[] mapArray;
  private int size = 0;

  public HashMapExample() {
    this.mapArray = new MapBucket[CAPACITY];
  }

  private int getHash(K key) {
    return key.hashCode() % CAPACITY;
  }

  private KeyValueEntry getEntry(K key) {
    int hash = getHash(key);
    for (int i = 0; i < mapArray[hash].getEntries().size(); i++) {
      KeyValueEntry e = mapArray[hash].getEntries().get(i);
      if(e.getKey().equals(key)) {
        return e;
      }
    } 
    return null;
  }

  public int size() {
    return size;
  }

  public int bucketSize(K key) {
    if (containsKey(key)) {
      int hash = getHash(key);
      return mapArray[hash].getEntries().size();
    }
    return 0;
  }

  public V get(K key) {
    return containsKey(key) ? (V) getEntry(key).getValue() : null;
  }

  public boolean containsKey(K key) {
    int hash = getHash(key);
    return !(Objects.isNull(mapArray[hash]) || Objects.isNull(getEntry(key)));
  }

  public int put(K key, V value) {
    if (containsKey(key)) {
      KeyValueEntry kve = getEntry(key);
      kve.setValue(value);
      return 0;
    } else {
      int hash = getHash(key);
      if (mapArray[hash] == null) {
        mapArray[hash] = new MapBucket();
      }
      mapArray[hash].addEntry(new KeyValueEntry<K,V>(key, value));
      size++;
      return 1;
    }
  }

  public boolean delete(K key) {
    if(containsKey(key)) {
      int hash = getHash(key);
      mapArray[hash].removeEntry(getEntry(key));
      size--;
      return true;
    }
    return false;
  }
}