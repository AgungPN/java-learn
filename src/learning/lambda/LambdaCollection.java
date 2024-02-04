package learning.lambda;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class LambdaCollection {
  public static void main(String[] args) {
    list();
    map();
  }

  public static void list() {
    List<String> names = new LinkedList<>(List.of("Agung", "Prasetyo", "Nugroho"));

//    foreach biasa
    for (var name : names) {
      System.out.println(name);
    }

//    foreach anonymous class
    names.forEach(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });

//    foreach lambda
    names.forEach(name -> System.out.println(name));

//    foreach lambda method reference
    names.forEach(System.out::println);

    names.removeIf(name -> name.length() > 5);
    names.forEach(System.out::println);
  }

  public static void map() {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "data1");
    map.put(2, "data2");
    map.put(3, "data3");

    for (var m : map.entrySet()) {
      System.out.println(m.getKey() + " : " + m.getValue());
    }

    map.forEach((key, value) -> System.out.println(key + " : " + value));
  }
}
