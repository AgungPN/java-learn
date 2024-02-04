package learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {
  public static void basic() {
    // bisa menambahkan data lebih dari satu (tidak bisa null)
    Stream<String> stream1 = Stream.of("Agung", "Prasetyo", "Nugroho");
    // empty stream
    Stream<String> stream2 = Stream.empty();
    // jika null maka akan menghasilkan empty stream, bisa juga string biasa
    Stream<String> stream3 = Stream.ofNullable(null);

    stream1.forEach(System.out::println);
    stream3.forEach(System.out::println);
  }

  public static void arrayToStream() {
    // Version 1
    String[] names = {"Agung", "Prasetyo", "Nugroho"};
    Stream<String> stream = Stream.of(names);
    stream.forEach(System.out::println);

    // Version 2
    String[] strs = {"abc", "def", "ghi"};
    Stream<String> stream2 = Arrays.stream(strs).map(String::toUpperCase);

    stream2.forEach(System.out::println);
  }

  public static void collectToStream() {
    List<String> names = List.of("Agung", "Prasetyo", "Nugroho");
    Stream<String> stream = names.stream();
    stream.forEach(System.out::println);
  }

  // Insert data stream one by one
  public static void streamBuilder() {
    Stream.Builder<String> builder = Stream.builder();
    // ada 2 cara untuk insert data ke stream builder
    // 1. dengan menggunakan accept, maka akan return void, jadi 1 statement hanya bisa insert 1 data
    builder.accept("Agung");
    // 2. dengan menggunakan add, maka akan return stream builder, jadi 1 statement bisa insert lebih dari 1 data
    builder.add("Prasetyo").add("Nugroho").add("29");

    // convert builder to stream
    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);

    Stream<Object> streamFromBuilder = Stream.builder().add("ABC").add("DEF").add("GHI").build();
  }
}
