import java.util.Scanner;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Tugas5 {

  public static void main(String[] args) {
    int a, b, c, T, hasilA, hasilB, hasilC;
    String result = "";
    boolean isImposible = true;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan nilai a: ");
    a = scanner.nextInt();
    System.out.print("Masukkan nilai b: ");
    b = scanner.nextInt();
    System.out.print("Masukkan nilai c: ");
    c = scanner.nextInt();
    System.out.print("Masukkan nilai T: ");
    T = scanner.nextInt();

    for (int i = 0; (hasilA = a * i) <= T; i++) {
      for (int j = 0; (hasilB = b * j) <= T; j++) {
        for (int k = 0; (hasilC = c * k) <= T; k++) {

          if (hasilA + hasilB + hasilC == T) {
            isImposible = false;
            result += i + " " + j + " " + k + " " + "\n";
/*
            System.out.println("tes: " + (hasilA + hasilB + hasilC) + " hasil-A: " +hasilA+ " hasil-B: " + hasilB+ " hasil-C: "+hasilC);
            System.out.println("i: "+i+" j: "+j+" k: "+ k);
            System.out.println("============");
*/
          }

        }
      }
    }

    System.out.println("Output: ");
    if (isImposible) {
      System.out.println("mustahil");
    } else {
      System.out.println(result);
    }

  }
}
