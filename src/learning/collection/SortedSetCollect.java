package learning.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */

public class SortedSetCollect {
  public static void main(String[] args) {
//    SortedSet<People> people = new TreeSet<>();  // langsung mengguanakn people class
//    SortedSet<People> people = new TreeSet<>(new PeopleComparator());  // membuat class khusus comparator
    SortedSet<People> people = new TreeSet<>(new PeopleComparator().reversed());
    people.add(new People("Prasetyo"));
    people.add(new People("Agung"));
    people.add(new People("Nugroho"));

    for (var person :people) {
      System.out.println(person.getName());
    }

  }
}
class People implements Comparable<People> {
  private String name;

  public People(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(People  o) {
    return this.name.compareTo(o.name);
  }
}

class PeopleComparator implements Comparator<People> {

  @Override
  public int compare(People o1, People o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
