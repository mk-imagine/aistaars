package hashmap;

public class KeyValueEntry<K, V> {
  private K key;
  private V value;

  public KeyValueEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public V setValue(V value) {
    this.value = value;
    return value;
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public boolean equals(Object key) {
    return this.key.equals(key);
  }
}
