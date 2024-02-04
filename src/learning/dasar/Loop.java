package learning.dasar;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Loop {
  public static void main(String[] args) {
    forLoop(10);
    forEach();
  }

  public static void forLoop(int length) {
    for (int i = 0; i < length; i++) {
      System.out.println(i);
    }
  }

  public static void forEach() {
    String[] names = {"Agung", "Prasetyo", "Nugroho"};

    System.out.println("WITHOUT FOREACH");
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    System.out.println("WITH FOREACH");
    for (var name : names) {
      System.out.println(name);
    }

  }
}
