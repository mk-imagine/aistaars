import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.List;

public class NewDS<E> extends AbstractList implements List{
  int size = 0;
  E[] data;

  NewDS(Class<E> clazz, int capacity) {
    data = (E[]) Array.newInstance(clazz, capacity);
    size = 0;
  }

  // @Override
  // public E get(int index) {
  //   return data[index];
  // }

  // @Override
  // public int size() {
  //   return size;
  // }
}
