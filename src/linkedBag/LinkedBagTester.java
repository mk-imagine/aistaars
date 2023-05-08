package linkedBag;

public class LinkedBagTester {
  public static void main(String[] args) {
    // Create a new LinkedBag1 instance
    LinkedBag1<Integer> lb = new LinkedBag1<>();
    int testQty = 20;

    // Unit test of isEmpty() and getCurrentSize()
    System.out.println("Linked Bag is empty: " + lb.isEmpty()); // true
    System.out.println("Number of entries in Linked Bag: " + lb.getCurrentSize()); // 0

    // Adding items to the LinkedBag1 named "lb"
    System.out.printf("\nAdding %d entries...\n", testQty);
    for (int i = 0; i < testQty; i++) {
      lb.add(i+10);
    }
    System.out.println("Done\n");

    // More unit tests of isEmpty() and getCurrentSize() after items are added
    System.out.println("Linked Bag is empty: " + lb.isEmpty()); // false
    System.out.println("Number of entries in Linked Bag: " + lb.getCurrentSize()); // 20

    // Convert LinkedBag1 to Array
    // Notice that the new array of the Object[] type.  We cannot make this an
    // Integer[] type because we do not know what kind of Array the toArray
    // method will be returning, so we use the main parent class of all objects in Java.
    System.out.println("\nConverting to Array...");
    Object[] intAry = lb.toArray();
    System.out.println("Done\n");

    // Return the class of the new array
    // in this case "[Ljava.lang.Object" is an Object Array.  It would return
    // "java.lang.Object" if it just an Object.  Don't ask me why they use "[L"
    // to represent an Array because I don't know
    System.out.printf("Object type of new array: %s\n\n", intAry.getClass().getName());

    // Print all the entries in the array
    printArr(intAry);
  }

  // Print the entries in the array
  public static void printArr(Object[] arr) {
    System.out.println("List of entries in Array:");

    // Enhanced for loop to print all the values in the array
    for(Object num : arr) {
      // The Integer object has a toString() method which is automatically
      // invoked when using the print() method.
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
