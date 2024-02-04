package learning.classes;

import java.util.Objects;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class OverrideMethod {
  String name;

  public OverrideMethod(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {  // diharapkan selalu override equals class karena default equals() akan membandingkan pointer
    if (this == o) return true;  //cek apakah param o adalah class ini sendiri
    if (o == null || getClass() != o.getClass()) return false;  // cek kalau o bernilai null atau nama classnya beda

    OverrideMethod equalsApp = (OverrideMethod) o;  // convert o ke Classes.Compare class

    return Objects.equals(name, equalsApp.name);
  }

  @Override
  public int hashCode() {  // hampir sama seperti toString(), tapi hashCode akan membua data integer unik yang akan membedakan satu class dengan yg lain
    return name != null ? name.hashCode() : 0;
  }

  @Override
  public String toString() {  // override toString() dari Object class, yang bisa digunakan ketika class dipanggil tanpa memanggil method/properti apapun.
    return "Override to string untuk class Classes.Compare";  // default string random
  }


  // ==============================================================================================
  public void primitiveCompare() {
//    Primitif perbandingan menggunakan == or ===
    int num1 = 20;
    int num2 = 20;
    System.out.printf("Data num1: %d is equals with num2: %d: is %b \n", num1, num2, num1 == num2);
  }

  public void objectCompare() {
//    untuk perbandingan data object kita menggunakan equals(), karena == === hanya membandingkan lokasi memory (pointer) bukan isinya.
    String name1 = "Agung";
    name1 += " Prasetyo";
    String name2 = "Agung Prasetyo";
    System.out.println(name1.equals(name2));
  }
}
