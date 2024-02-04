import java.util.Scanner;

public class Tester {
  public static void main(String[] args) {
    PegawaiKontrak[] pegawaiKontraks = null;
    PegawaiTetap[] pegawaiTetaps = null;
    PegawaiTetap pegawaiTetapMax = null;
    PegawaiKontrak pegawaiKontrakMax = null;
    PegawaiTetap pegawaiTetapMin = null;
    PegawaiKontrak pegawaiKontrakMin = null;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input berapa pegawai: ");
    int jumlahPegawai = scanner.nextInt();
    System.out.println("Opsi:");
    System.out.println("1. K (Pegawai Kontrak)");
    System.out.println("2. T (Pegawai Tetap)");
    System.out.print("pilihan (K/T): ");
    String chosen = scanner.next();

    if (chosen.equalsIgnoreCase("K")) {
      pegawaiKontraks = new PegawaiKontrak[jumlahPegawai];
      for (int i = 0; i < jumlahPegawai; i++) {
        System.out.println("================");
        System.out.println("data ke-" + (i + 1));
        pegawaiKontraks[i] = new PegawaiKontrak();

//        Gaji pegawai terbanyak
        if (pegawaiKontrakMax == null) {
          pegawaiKontrakMax = pegawaiKontraks[i];
        } else if (pegawaiKontrakMax.totalGaji < pegawaiKontraks[i].totalGaji) {
          pegawaiKontrakMax = pegawaiKontraks[i];
        }

//        Gaji pegawai terkecil
        if (pegawaiKontrakMin == null) {
          pegawaiKontrakMin = pegawaiKontraks[i];
        } else if (pegawaiKontrakMin.totalGaji > pegawaiKontraks[i].totalGaji) {
          pegawaiKontrakMin = pegawaiKontraks[i];
        }
      }
    } else if (chosen.equalsIgnoreCase("T")) {
      pegawaiTetaps = new PegawaiTetap[jumlahPegawai];
      for (int i = 0; i < jumlahPegawai; i++) {
        System.out.println("================");
        System.out.println("data ke-" + (i + 1));
        pegawaiTetaps[i] = new PegawaiTetap();

//        Gaji pegawai terbanyak
        if (pegawaiTetapMax == null) {
          pegawaiTetapMax = pegawaiTetaps[i];
        } else if (pegawaiTetapMax.totalGaji < pegawaiTetaps[i].totalGaji) {
          pegawaiTetapMax = pegawaiTetaps[i];
        }

//        Gaji pegawai terkecil
        if (pegawaiTetapMin == null) {
          pegawaiTetapMin = pegawaiTetaps[i];
        } else if (pegawaiTetapMin.totalGaji > pegawaiTetaps[i].totalGaji) {
          pegawaiTetapMin = pegawaiTetaps[i];
        }
      }
    } else {
      System.out.println("Pilihan tidak valid");
      System.exit(0);
    }

    int pilihan;
    do {
      System.out.println("\nMENU: ");
      System.out.println("1. Cetak Semua Pegawai");
      System.out.println("2. Gaji Total Terbanyak");
      System.out.println("3. Gaji Total Terkecil");
      System.out.println("4. Keluar");
      System.out.print("Pilihan: ");
      pilihan = scanner.nextInt();
      if (pilihan == 1) {
        if (pegawaiKontraks != null) {
          for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println((i + 1) + ". Nama: " + pegawaiKontraks[i].nama + "\tNIP: " + pegawaiKontraks[i].nip + "\tGaji Total: " +
              pegawaiKontraks[i].totalGaji);
          }
        } else {
          for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println((i + 1) + ". Nama: " + pegawaiTetaps[i].nama + "\tNIP: " + pegawaiTetaps[i].nip + "\tGaji Total: " +
              pegawaiTetaps[i].totalGaji);
          }
        }
      } else if (pilihan == 2) {
        System.out.println("Gaji karyawan terbesar adalah");
        if (pegawaiKontraks != null) {
          System.out.println("Nama: " + pegawaiKontrakMax.nama + "\tNIP: " + pegawaiKontrakMax.nip + "\tGaji Total: " + pegawaiKontrakMax.totalGaji);
        } else {
          System.out.println("Nama: " + pegawaiTetapMax.nama + "\tNIP: " + pegawaiTetapMax.nip + "\tGaji Total: " + pegawaiTetapMax.totalGaji);
        }
      } else if (pilihan == 3) {
        System.out.println("Gaji karyawan terkecil adalah");
        if (pegawaiKontraks != null) {
          System.out.println("Nama: " + pegawaiKontrakMin.nama + "\tNIP: " + pegawaiKontrakMin.nip + "\tGaji Total: " + pegawaiKontrakMin.totalGaji);
        } else {
          System.out.println("Nama: " + pegawaiTetapMin.nama + "\tNIP: " + pegawaiTetapMin.nip + "\tGaji Total: " + pegawaiTetapMin.totalGaji);
        }
      }
    } while (pilihan != 4);

  }
}
