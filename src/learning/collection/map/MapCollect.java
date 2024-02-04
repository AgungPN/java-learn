package learning.collection.map;

import java.util.*;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class MapCollect {
  public static void main(String[] args) {
//    =========HASH MAP=============
    Map<String, String> names = new HashMap<>();  // HashMap merupakan implementasi dari map yang memanfaatkan method hasCode()

    names.put("name.name1", "Agung Prasetyo Nugroho"); // put untuk menambahkan dan mengubah data
    names.put("name.name2", "Prasetyo N");
    names.put("names.name2", "Agung PN");

    System.out.println(names.get("name.name1"));
    System.out.println(names.get("name.name2"));

//    ===========WEAKHASHMAP=============
    Map<Integer, Integer> weakMap = new WeakHashMap<>(); // WeakMap hampir mirip dengan HashMap tapi jika data lama tidak dipakai maka akan dihapus
    for (int i = 0; i < 1_000_000; i++) {
      weakMap.put(i, i);
    }
    System.out.println(weakMap.size());  // nilai tidak lagi 1_000_000 yg 2jt data telah dihapus karena tidak pernah digunakan dalam kurun waktu lama.

//    ===========LinkedListMap=============
//    LinkedHashMap merupakan map yang menggunakan double linked list, akan lambat ketika get data karena harus mengulang data 1 1
//    data dipastikan terurut sesuai dengan waktu masukkan
    Map<String, String> linkedMap = new LinkedHashMap<>();
    linkedMap.put("first","pertama");
    linkedMap.put("second","kedua");
    linkedMap.put("third","ketiga");

    Set<String> keys = linkedMap.keySet();
    for (String key: keys) {
      System.out.println(key);
    }

//    ===========EnumMap=============
// Menjadikkan enum sebagai key nya
    Map<School, String > enumMap = new EnumMap<School, String>(School.class);
    enumMap.put(School.SD,"SDN Kadirejo 02");
    enumMap.put(School.SMP,"SMP 02 Pabelan");
    enumMap.put(School.SMK,"SMK TELEKOMUNIKASI TUNAS HARAPAN");

    for (School key : enumMap.keySet()) {
      System.out.println(enumMap.get(key));
    }

  }

  public static enum School{
    SD,SMP,SMK
  }
}
