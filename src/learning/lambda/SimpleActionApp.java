package learning.lambda;

import learning.lambda.util.SimpleAction;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class SimpleActionApp {
  public static void main(String[] args) {
//    cara manual
    SimpleAction simpleAction1 = new SimpleAction() {
      @Override
      public String action(String name) {
        return "Hello, " + name;
      }

    };
    System.out.println(simpleAction1.action("Agung PN"));
//    cara lamda
    SimpleAction simpleAction = (String name) -> {
      return "Hello, " + name;
    };
    SimpleAction simpleAction2 = (name) -> {
      return "Hello, " + name;
    };
    SimpleAction simpleAction3 = name -> "Hello, " + name;

    System.out.println(simpleAction.action("Agung Prasetyo N"));
  }

}
