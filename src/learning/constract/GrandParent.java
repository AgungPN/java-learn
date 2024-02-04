package learning.constract;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public interface GrandParent extends GetterName, SetterName { // inheritance interface can more than 1
  void sayHello(String name);

  default String message() {  // default make optional to override (since java 8) <GAK WAJIB DI OVERRIDE>
    return "I'm learn OOP";
  }

  default void ghost(){}
}
