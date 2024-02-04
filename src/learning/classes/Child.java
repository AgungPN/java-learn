package learning.classes;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Child extends Parent {
  private String name;

  public Child(String name) {
//      when class parent doesn't have constructor default, we must call constructor class parent with super()
    super(name);
  }

  public void sayHello(String name) {  // override method parent (menimpa/mendeklarasikan ulang method parent)
    this.name = name;
    setName(name);  // change parent name or with super.name = name
    System.out.println("Hello Classes.Child, " + name);
  }

  public void sayHelloParent() {
    super.sayHello(name);  // memanggil method sayHello dari parent
    sayHello(name);  // memanggil method sayHello dari child
  }
}
