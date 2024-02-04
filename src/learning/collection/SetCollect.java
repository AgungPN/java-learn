package learning.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class SetCollect {
  public static void main(String[] args) {
//    set collection merupakan collection yang mana datanya bersifat unique, dan tidak memilki urutan index pada datanya.
//    turunn dari set yaitu (EnumSet, HashSet, LinkedHashSet => turunan HashSet juga)

/* HashSet datanya tidak terjamin terurut, tapi kalau LinkedHashSet datanya terjamin urut */

//    Set<String> names = new HashSet<>();
    Set<String> names = new LinkedHashSet<>();
    names.add("Agung");
    names.add("Prasetyo");
    names.add("Nugroho");
    names.add("Agung");
    names.add("Prasetyo");
    names.add("Nugroho");

    for (var name :names) {
      System.out.println(name);
    }

  }
}
