package learning.classes;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class InnerClass extends Outside{
  private String name;

  public InnerClass(String paramName){
    name = paramName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public class Inside {  // inner class
//    with inner class we can use private property and method in outer class
    public void getNameInside() {
      System.out.println(InnerClass.this.name);  // access outer private property
    }

    public void sayOutsideWithInside(){
      String saySomething = InnerClass.super.sayOutside();  // access parent outer class
      System.out.println(saySomething+" with inside");
    }
  }
}

class Outside{
  public String  sayOutside(){
    return "outside";
  }
}