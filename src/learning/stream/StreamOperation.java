package learning.stream;

import java.util.stream.Stream;

public class StreamOperation {
  public static void basicOperation() {
    // Stream bersifat immutable, artinya tidak bisa diubah, jadi meskipun dilakukan operation maka tidak akan merubah data aslinya
    // Operation yang dilakukan pada stream akan menghasilkan stream baru

    Stream<String> streamNames1 = Stream.of("Agung", "Prasetyo", "Nugroho");
    // stream juga bisa pipeline, artinya bisa melakukan operation lebih dari 1 dalam 1 statement
    Stream<String> streamNames2 = streamNames1
      .map(String::toUpperCase)
      .filter(name -> name.length() > 5)
      .map(name -> "Mr. " + name);

    streamNames2.forEach(System.out::println);
  }
}
