package learning.stream;

public class StreamMain {
  public static void main(String[] args) {
    // basicStream();
    streamOperation();
  }

  private static void basicStream() {
    // Stream adalah aliran data, yang mana artinya sekali datanya mengalir/dieksekusi maka tidak bisa digunakan lagi (jadi tidak bisa menggunakan 2x looping dengan stream yang sama)
    // Stream juga bisa digunakan untuk mengolah data, seperti filter, map, reduce, collect, dll
    // Stream juga bisa digunakan untuk parallel processing

    BasicStream.basic();
    System.out.println("==================================");
    BasicStream.arrayToStream();
    System.out.println("==================================");
    BasicStream.collectToStream();
    System.out.println("==================================");
    BasicStream.streamBuilder();
  }

  private static void streamOperation() {
    StreamOperation.basicOperation();
  }
}
