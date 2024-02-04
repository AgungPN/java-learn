package learning.collection.map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class SortedMapCollect {
  public static void main(String[] args) {
//    Sorted key pada map

//    OPTIONAL untuk mencustom compare sorted
    Comparator<String> stringComparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    };

    SortedMap<String, String> sortedMap = new TreeMap<>();
    sortedMap.put("key1", "data1");
    sortedMap.put("key3", "data3");
    sortedMap.put("key2", "data2");

    for (var key : sortedMap.keySet()) {
      System.out.println(key);
    }

  }
}
