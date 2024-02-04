package learning.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class UtilFunction {
  public static void main(String[] args) {
    consumer();
    function();
    predicate();
    supplier();
  }

  public static void consumer(){
//    manual version
    Consumer<String > stringConsumer = new Consumer<String>() {
      @Override
      public void accept(String string) {
        System.out.println(string);
      }
    };
    stringConsumer.accept("Agung PN");

    Consumer<String > stringConsumer1 = name -> System.out.println(name);
    stringConsumer1.accept("Agung Prasetyo N");
  }

  public static void function(){
    Function<String, Integer> functionLength = new Function<String, Integer>() {
      @Override
      public Integer apply(String string) {
        return string.length();
      }
    };
    System.out.println(functionLength.apply("Ini String"));


    Function<String, Integer> functionLength1 = string -> string.length();
    System.out.println(functionLength1.apply("WOWO"));
  }

  public static void predicate(){
    Predicate<String> predicate = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.isBlank();
      }
    };
    System.out.println(predicate.test(""));


    Predicate<String> predicate1 = s -> s.isBlank();
    System.out.println(predicate.test("TES"));
  }

  public static void supplier(){
    Supplier<String > myName = new Supplier<String>() {
      @Override
      public String get() {
        return "Agung PN";
      }
    };
    System.out.println(myName.get());

    Supplier<String> name = () -> "Agung Prasetyo N";
    System.out.println(name.get());
  }
}
