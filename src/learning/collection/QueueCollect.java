package learning.collection;

import java.util.*;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class QueueCollect {
  public static void main(String[] args) {
//    =================QUEUE=====================
//    Queue<String> names  = new ArrayDeque<>();  // antrian yg menggunakan array
//    Queue<String> names  = new LinkedList<>();  // antrian yg menggunakan linked list
    Queue<String> names  = new PriorityQueue<>();  // antrian yg menggurutkan datanya (sort)
    names.add("Agung");
    names.offer("Prasetyo");  // offer merupakan cara lain untuk menambahkan data
    names.offer("Nugroho");
    System.out.println(names.size());

//    poll mengambil data dan mengapusnya
    for (String name = names.poll(); name != null; name = names.poll()){
      System.out.println(name);
    }
    System.out.println(names.size());  // 0 karena data telah dihapus semua

//    =================DEQUEUE=====================
    // dequeue => perpaduan antara stack and queue (LIFO & FIFO)
    System.out.println("====DEQUEUE====");
    Deque<Integer> numbers = new ArrayDeque<>();
    numbers.addLast(1);
    numbers.offerLast(2);
    numbers.offerFirst(3);

    for (Integer number = numbers.pollLast(); number != null; number = numbers.pollLast()){
      System.out.println(number);
    }

  }
}
