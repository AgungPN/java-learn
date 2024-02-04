package learning.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class ListCollect {
  public static void main(String[] args) {
//    List merupakan learning.collection yang mana bisa memiliki data yang sama (ArrayList, LinkedList)
    // cepat untuk mencari data dari index. Tapi lambat ketika menambah data, karena ketika inisialisasi akan dibuatkan 10 array, lalu ketika mengisi data ke 11 akan membuat array baru dan mencopy array lama
    List<String> names = new ArrayList<>();
//    cepat ketika menambahkan data, tapi lambah ketika mencari data karena akan dimulai dari awal
    List<Integer> numbers = new LinkedList<>();
  }
}
