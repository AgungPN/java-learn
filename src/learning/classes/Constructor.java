package learning.classes;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Constructor {
  private String name;
  public Constructor(String name) {
    name = name;  // variable shadowing, artinya attribute nama tidak akan berubah karena nama attribute sama dengan nama variable
//        name = paramName // solusi 1, ubah nama parameter
    this.name = name;
//        ==========================
    System.out.println("Hello, " + name);
    sayHolla(name);
  }

  public Constructor(int tes) {
//        memanggil constructor lain haruslah berada di statment paling awal, dan 1 method hanya boleh 1x panggil
    this("tes");
    System.out.println("tes: " + tes);
    System.out.println("Attribute name: " + name);
  }

  public void sayHolla() {
    System.out.println("Holla, " + name);
  }

  public void sayHolla(String name) {
    this.name = name;
    this.sayHolla();
  }

  public Constructor(String example, int tes) {
//        cara memanggil constructor lain
    this(tes);
    System.out.printf("Example: %s, tes: %d", example, tes);
  }
}

