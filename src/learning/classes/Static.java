package learning.classes;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Static {  // static akan membuat property/method menempel pada class, dengan begitu class tidak perlu di inisialisasi
//  WARNING: static harus bisa digunakan pada  static juga
  public static final String KEYWORD = "static"; // constant, can't change value
  public static boolean isStatic = true;   // property static

  public static final Long FREE_MEMORY;

  static { // automatic run before start class
  FREE_MEMORY = Runtime.getRuntime().freeMemory();
  }

  public static void sayStatic() {  // method static
    System.out.println(KEYWORD + "...!!!");
//    nonStatic() // error
  }

  public void nonStatic(){
    System.out.print("Non ");
    sayStatic();  // success
  }
}
