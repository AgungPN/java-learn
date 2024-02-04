package learning.collection.map;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class NavigableMapCollect {
  public static void main(String[] args) {
//    NavigableMap seperti NavigableSet akan secara otomatis mensorted data lalu memeiliki beberapa method tambahan
    NavigableMap<String ,String > map = new TreeMap<>();

    map.put("key2","data2");
    map.put("key1","data1");
    map.put("key3","data3");

    for (var key : map.keySet()) {
      System.out.println(key);
    }

    System.out.println(map.lowerKey("key2"));  // data yg < dari key2
    System.out.println(map.higherKey("key2")); // data yg > dari key2

    System.out.println(map.ceilingKey("key1")); // data yg >= dari key1
    System.out.println(map.floorKey("key3"));  // data yg <= dari key3
  }
}
