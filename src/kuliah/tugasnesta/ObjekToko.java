package kuliah.tugasnesta;

import java.util.Scanner;

public class ObjekToko {


  public static void main(String[] args) {


    listToko lt = new listToko();
    Scanner sc = new Scanner(System.in);
    int pilih, jumlah, indeks = -1;
    boolean find = false;
    char jawab;
    String barang;
    do {
      System.out.println("===MENU UTAMA===");
      System.out.println("1. Input Data");
      System.out.println("2. Tampilkan Data");
      System.out.println("3. Edit Data");
      System.out.println("4. Hapus Data");
      System.out.println("Masukkan Pilihan Anda : ");
      pilih = sc.nextInt();
      switch (pilih) {
        case 1 -> {
          //memberikan input
          do {
            System.out.println("Masukkan Jumlah Data : ");
            jumlah = sc.nextInt();
            for (int i = 0; i < jumlah; i++) {
              lt.input(sc.nextInt(), sc.next(), sc.nextLong());
            }
            System.out.println("Coba lagi? (y/n) : ");
            jawab = sc.next().charAt(0);
          } while (jawab == 'Y' || jawab == 'y');
        }
        case 2 -> {
          //menampilkan input
          lt.tampil();
          System.out.println();
        }
        case 3 -> {
          int newKode;
          long newHarga;
          String newNamaBarang;
          do {
            System.out.println("Masukkan nama barang yang akan diubah : ");
            barang = sc.next();
            for (int i = 0; i < lt.data.size(); i++) {
              if (lt.data.get(i).namaBarang.equals(barang)) {
                indeks = i;
                find = true;
              }
            }
            if (find == true) {
              System.out.println("Input Kode Barang Baru : ");
              newKode = sc.nextInt();
              System.out.println("Input Nama Barang Baru : ");
              newNamaBarang = sc.next();
              System.out.println("Input Harga Barang Baru : ");
              newHarga = sc.nextLong();
              lt.ubah(indeks, newKode, newNamaBarang, newHarga);
              lt.tampil();
              System.out.println();
            } else {
              System.out.println("Tidak ada data");
            }
            System.out.println("Coba lagi? (y/n) : ");
            jawab = sc.next().charAt(0);
          } while (jawab == 'Y' || jawab == 'y');
        }
        case 4 -> {
          do {
            System.out.println("Masukkan nama barang yang akan dihapus : ");
            barang = sc.next();
            for (int i = 0; i < lt.data.size(); i++) {
              if (lt.data.get(i).namaBarang.equals(barang)) {
                indeks = i;
                find = true;
              }
            }
            lt.hapus(indeks);
            System.out.println("Data Berhasil Dihapus");
            lt.tampil();
            System.out.println();
            System.out.println("Coba lagi? (y/n) : ");
            jawab = sc.next().charAt(0);
          } while (jawab == 'Y' || jawab == 'y');
        }
        default -> System.out.println("Tidak Ada Data");
      }
    } while (pilih != 4);
  }
}