package learning.dasar;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Method {
  public static void main(String[] args) {
    int[] values = {100, 20, 40, 80};
    sayCongrats("Namaku", values);

    sayCongrats2("Agung", 80, 90, 100, 99, 86);
  }

  static void sayCongrats(String name, int[] values) {
    int total = 0;
    for (var value : values) total += value;
    var grade = total / values.length;
    var message = grade >= 75 ? "Selamat " + name + " Anda lulus dengan nilai: " + grade : "Maaf " + name + " kamu hanya mendapatkan nilai " + grade;
    System.out.println(message);
  }

  static void sayCongrats2(String name, int... values) {
    int total = 0;
    for (var value : values) total += value;
    var grade = total / values.length;
    var message = grade >= 75 ? "Selamat " + name + " Anda lulus dengan nilai: " + grade : "Maaf " + name + " kamu hanya mendapatkan nilai " + grade;
    System.out.println(message);
  }
}