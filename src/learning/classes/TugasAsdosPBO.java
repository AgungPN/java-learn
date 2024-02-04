import java.util.Scanner;

public class TugasAsdosPBO {
  public static void main(String[] args) {
    int nimMahasiswa[] = new int[1];
    int matkul[] = new int[1];
    int lengthMahasiswa = 0, jumlahMatkul = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan Nama Anda: ");
    String name = scanner.nextLine();
    for (; ; ) {

      System.out.println("=== MENU ===");
      System.out.println("1. Input Nim Mahasiswa");
      System.out.println("2. Rekap Nilai");
      System.out.println("3. Exit");
      System.out.print("Pilihan: ");
      int pilihan = scanner.nextInt();
      if (pilihan == 1) {
        System.out.print("\nJumlah Mahasiswa: ");
        lengthMahasiswa = scanner.nextInt();
        nimMahasiswa = new int[lengthMahasiswa];

        for (int i = 0; i < lengthMahasiswa; i++) {
          System.out.print("NIM ke-" + (i + 1) + " = ");
          nimMahasiswa[i] = scanner.nextInt();
        }
        System.out.println("\n=== Data Nim Mahasiswa ====");
        for (int i = 0; i < lengthMahasiswa; i++) {
          System.out.println("Nim Mahasiswa Ke-" + (i + 1) + " = " + nimMahasiswa[i]);
        }
        System.out.println("ulangi y/n :");
        scanner.nextLine();
        String kmn = scanner.next();
        while (kmn.contains("y")) {
          System.out.print("\nJumlah Mahasiswa: ");
          lengthMahasiswa = scanner.nextInt();
          nimMahasiswa = new int[lengthMahasiswa];

          for (int i = 0; i < lengthMahasiswa; i++) {
            System.out.print("NIM ke-" + (i + 1) + " = ");
            nimMahasiswa[i] = scanner.nextInt();
          }
          System.out.println("\n=== Data Nim Mahasiswa ====");
          for (int i = 0; i < lengthMahasiswa; i++) {
            System.out.println("Nim Mahasiswa Ke-" + (i + 1) + " = " + nimMahasiswa[i]);
          }
          System.out.println("ulangi y/n :");
          scanner.nextLine();
          kmn = scanner.next();
        }
      } else if (pilihan == 2) {
        System.out.print("\nJumlah Mata Kuliah: ");
        jumlahMatkul = scanner.nextInt();
        matkul = new int[jumlahMatkul];
        double ratarata = 0.0;
        for (int i = 0; i < jumlahMatkul; i++) {
          System.out.print("Nilai Matkul ke-" + (i + 1) + " = ");
          matkul[i] = scanner.nextInt();
          ratarata += matkul[i];
        }
        ratarata /= jumlahMatkul;
        System.out.println("Rata-rata nilai matkul " + name + " : " + ratarata);

        if (ratarata >= 90) {
          System.out.println("A");
        } else if (ratarata >= 80) {
          System.out.println("B");
        } else if (ratarata >= 70) {
          System.out.println("C");
        } else if (ratarata >= 60) {
          System.out.println("D");
        } else {
          System.out.println("E");
        }
        System.out.println("ulangi y/n :");
        scanner.nextLine();
        String kmn = scanner.next();
        while (kmn.contains("y")) {
          System.out.print("\nJumlah Mata Kuliah: ");
          jumlahMatkul = scanner.nextInt();
          matkul = new int[jumlahMatkul];
          ratarata = 0.0;
          for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Nilai Matkul ke-" + (i + 1) + " = ");
            matkul[i] = scanner.nextInt();
            ratarata += matkul[i];
          }
          ratarata /= jumlahMatkul;
          System.out.println("Rata-rata nilai matkul " + name + " : " + ratarata);

          if (ratarata >= 90) {
            System.
              out.println("A");
          } else if (ratarata >= 80) {
            System.out.println("B");
          } else if (ratarata >= 70) {
            System.out.println("C");
          } else if (ratarata >= 60) {
            System.out.println("D");
          } else {
            System.out.println("E");
          }
          System.out.println("ulangi y/n :");
          scanner.nextLine();
          kmn = scanner.next();
        }

      } else if (pilihan == 3) {
        break;
      } else {
        System.out.println("input salah");
      }

      System.out.println("");
    }
  }
}
