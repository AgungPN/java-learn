package learning.classes;

import learning.constract.GrandParent;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Parent implements GrandParent {
  private String name;

  public Parent(String name) {
    this.name = name;
    setName(name);
  }
  public void sayHello(String name) {
    System.out.println("Hello parent, " + name);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

}
