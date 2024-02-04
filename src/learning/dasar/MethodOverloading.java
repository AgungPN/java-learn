package learning.dasar;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class MethodOverloading {
  public static void main(String[] args) {
//        overloading, memungkinkan membuat method dengan nama yang sama tetapi parameternya berbeda
    sayHello();
    sayHello("Agung Prasetyo Nugroho");
    System.out.println(sayHello("Agung Prasetyo", "Nugroho"));
  }

  static void sayHello() {
    System.out.println("Hello");
  }

  static void sayHello(String name) {
    System.out.println("Hello, " + name);
  }

  static String sayHello(String name, String lastName) {
    return "Hello, " + name + ' ' + lastName + '!';
  }
}
