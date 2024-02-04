package learning.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Collect {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("Agung");
    names.add("Prasetyo");
    names.addAll(List.of("Nugroho", "Agung Prasetyo Nugroho"));

//    foreach
    for (String name : names) {
      System.out.println(name);
    }

    names.remove("Nugroho");
//    iterator for
    System.out.println("Iterator for: ");
    for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
      String next = iterator.next();
      System.out.println(next);
    }

    names.removeAll(List.of("Agung Prasetyo Nugroho", "Tidak ditemukkan"));  // ketika data tidak ditemukkan maka tidak terjadi apapun
//    iterate
    System.out.println("Iterator while: ");
    Iterator<String> namesIterator = names.iterator();
    while (namesIterator.hasNext()) {
      String next = namesIterator.next();
      System.out.println(next);
    }

    System.out.println("Contains : ");
    System.out.println(names.contains("Agung"));  // mengecek apakah ada data yg dicari return false
    System.out.println(names.containsAll(List.of("Prasetyo", "tidak ada")));  // jika tidak ditemukkan sekali maka false

  }
}
