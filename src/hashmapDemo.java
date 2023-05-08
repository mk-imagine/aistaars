import hashmap.HashMapExample;
import hashmap.MyString;

public class hashmapDemo {
  public static void main(String[] args) {
    HashMapExample<MyString, String> myHashmap = new HashMapExample<>();
    MyString hello = new MyString("Hello");
    MyString goodbye = new MyString("Goodbye");
    myHashmap.put(hello, "A greeting");
    myHashmap.put(new MyString("olleH"), "The reversal of the string 'Hello'.");
    myHashmap.put(goodbye, "a concluding remark or gesture at parting.");
    System.out.println("Bucket Size of 'Hello': " + myHashmap.bucketSize(hello));
    System.out.println("Bucket Size of 'Goodbye': " + myHashmap.bucketSize(goodbye));
  }
}