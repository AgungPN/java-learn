package kuliah.hari6.tugas.tugas_kelompok;

import java.util.Scanner;

/**
 * nama kelompok:
 *
 * @author AGUNG PRASETYO NUGROHO <672021077>
 * @author CHRISTIAN DWI NUGROHO <672021157>
 * @author GADING INDRAJATI <672021070>
 */
public class Tugas1 {

  public static void main(String[] args) {
//    ================================
//    SOAL NOMER 1
//    ================================

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan ukuran dimensi 1: ");
    int dimensi1 = scanner.nextInt();
    System.out.print("Masukkan ukuran dimensi 2: ");
    int dimensi2 = scanner.nextInt();
    System.out.println("===================================");

    int[][] numbers = new int[dimensi1][dimensi2];

    for (int i = 0; i < dimensi1; i++) {
      for (int j = 0; j < dimensi2; j++) {
        System.out.print("Masukkan value ke [" + i + "][" + j + "]: ");
        numbers[i][j] = scanner.nextInt();
      }
      System.out.println("");
    }

    System.out.println("===================================");
    System.out.print("Masukkan value yang dicari: ");
    int value = scanner.nextInt();

    for (int i = 0; i < dimensi1; i++) {
      for (int j = 0; j < dimensi2; j++) {
        if (value == numbers[i][j]) {
          System.out.println("ditemukkan di index ke [" + i + "][" + j + "]");
        }
      }
    }


//    ================================
//    SOAL NOMER 2
//    ================================
    int jum = 0, lah = 0, total = 0;
    int[] pel1 = new int[5];
    int[] pel2 = new int[5];
    String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
    String hari1[] = {"Toko ", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Total"};
    Scanner day = new Scanner(System.in);

    System.out.println("Masukkan jumlah pelanggan pada toko 1");
    for (int i = 0; i < 5; i++) {
      System.out.println(hari[i]);
      pel1[i] = day.nextInt();
      jum += pel1[i];
    }

    System.out.println("Masukkan jumlah pelanggan pada toko 2");
    for (int j = 0; j < 5; j++) {
      System.out.println(hari[j]);
      pel2[j] = day.nextInt();
      lah += pel2[j];
    }

    for (int a = 0; a < hari1.length; a++) {
      System.out.print(hari1[a]);
      System.out.print("\t");
    }

    System.out.println("");
    System.out.print("Toko1\t");

    for (int x = 0; x < pel1.length; x++) {
      System.out.print(pel1[x]);
      System.out.print("\t\t");
    }
    System.out.println(jum);

    System.out.println("");
    System.out.print("Toko2\t");

    for (int y = 0; y < pel2.length; y++) {
      System.out.print(pel2[y]);
      System.out.print("\t\t");
    }
    System.out.println(lah);

    System.out.println("");
    System.out.println("===================================================");
    System.out.print("Total  ");

    for (int z = 0; z < 5; z++) {
      total = pel1[z] + pel2[z];
      System.out.print(total);
      System.out.print("\t\t");
    }

    System.out.print("");
    System.out.print(jum + lah + "\n");

//    ================================
//    SOAL NOMER 3
//    ================================
    Scanner baca = new Scanner(System.in);
    System.out.println("Nama Ayah : ");
    String ayah = baca.nextLine();
    int panjangAyah = ayah.length();
    System.out.println("Nama Ibu : ");
    String ibu = baca.nextLine();
    int panjangIbu = ibu.length();
    System.out.println("Jenis kelamin anak : ");
    String anak = baca.nextLine();

    if (anak.equals("laki-laki")) {
      System.out.println("Saran Nama = " + ayah.substring(0, panjangAyah / 2).concat(ibu.substring(0, panjangIbu / 2)).toUpperCase());
    } else if (anak.equals("perempuan")) {
      System.out.println("Saran Nama = " + ibu.substring(0, panjangIbu / 2).concat(ayah.substring(0, panjangAyah / 2)).toUpperCase());
    } else {
      System.out.println("Error");
    }

  }
}
