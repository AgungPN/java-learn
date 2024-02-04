package kuliah.kuisasdos;

import java.util.*;

/**
 * @author Agung Prasetyo Nugroho <672021077>
 * @author Yoel Dinata Suwito <672021278>
 * @author Sebastian Gunawan <672021085>
 */
public class Tester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int chosen, no;
    boolean status;
    String name, fakultas;
    int nim, umur;
    List<Mahasiswa> mahasiswaList = new ArrayList<>();

    do {
      System.out.println("\nMENU");
      System.out.println("1. Input data mahasiswa");
      System.out.println("2. Input point mahasiswa");
      System.out.println("3. Tampilkan data mahasiswa");
      System.out.println("4. Keluar");
      System.out.print("Pilihan: ");
      chosen = scanner.nextInt();
      if (chosen == 1) {
        System.out.print("Masukkan banyak mahasiswa: ");
        int banyak = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= banyak; i++) {
          System.out.println("========================");
          System.out.println("Input Data Mahasiswa ke-" + i);
          System.out.print("Masukkan nama:");
          name = scanner.nextLine();
          System.out.print("Masukkan NIM:");
          nim = scanner.nextInt();
          System.out.print("Masukkan umur:");
          umur = scanner.nextInt();
          System.out.print("Masukkan fakultas:");
          scanner.nextLine();
          fakultas = scanner.nextLine();

          mahasiswaList.add(new Mahasiswa(nim, umur, name, fakultas));
        }
      } else if (chosen == 2) {

        System.out.println("List NIM mahasiswa: ");
        no = 1;
        for (Iterator<Mahasiswa> iterator = mahasiswaList.iterator(); iterator.hasNext(); no++) {
          Mahasiswa mahasiswa = iterator.next();
          System.out.println("Nim ke-" + no + " = " + mahasiswa.nim);
        }

        System.out.print("Pilih nim mahasiswa: ");
        nim = scanner.nextInt();

        Mahasiswa mahasiswa = findMahasiswa(mahasiswaList, nim);
        if (mahasiswa == null) {
          System.out.println("Data mahasiswa tidak ditemukkan!");
          continue;
        }

        System.out.print("Masukkan id jenis poin(1-4): ");
        int idPoin = scanner.nextInt();
        PointKKM pointKKM = new PointKKM();
        status = false;
        for (int j = 0; j < pointKKM.id.length; j++) {
          if (idPoin == pointKKM.id[j]) {
            status = true;
            mahasiswa.pointKKM += pointKKM.jumlahPoin[j];
            System.out.println("Poin KKM jenis " + pointKKM.namaPoin[j] + " berhasil ditambahkan ke NIM = " + nim);
            break;
          }
        }
        if (!status) {
          System.out.println("ID Poin tidak ditemukkan");
        }

      } else if (chosen == 3) {
        for (; ; ) {
          System.out.println("\nMenu tampilan data mahasiswa:");
          System.out.println("1. Semua data mahasiswa");
          System.out.println("2. Data mahasiswa tertentu");
          System.out.println("3. Kembali");
          int pilihan = scanner.nextInt();
          if (pilihan == 1) {
            no = 1;
            for (Iterator<Mahasiswa> iterator = mahasiswaList.iterator(); iterator.hasNext(); no++) {
              Mahasiswa mahasiswa = iterator.next();
              System.out.println(no + ". Nama: " + mahasiswa.name + "\tNIM: " + mahasiswa.nim + "\tUmur: " +
                mahasiswa.umur + "\tPoinKKM: " + mahasiswa.pointKKM + "\tFakultas: " + mahasiswa.fakultas);
            }

          } else if (pilihan == 2) {
            System.out.print("Masukkan NIM yang ingin dicari: ");
            nim = scanner.nextInt();
            Mahasiswa mahasiswa = findMahasiswa(mahasiswaList, nim);
            if (mahasiswa == null) {
              System.out.println("Data mahasiswa tidak ditemukkan!");
              continue;
            }
            System.out.println("Nama: " + mahasiswa.name + "\tNIM: " + mahasiswa.nim + "\tPoinKKM: " + mahasiswa.pointKKM);
          } else if (pilihan == 3) {
            break;
          } else {
            System.out.println("Pilihan tidak tepat");
          }
        }
      } else {
        System.out.println("Pilihan salah");
      }
    } while (chosen != 4);
  }

  public static Mahasiswa findMahasiswa(List<Mahasiswa> mahasiswas, int nim) {
    for (Mahasiswa mahasiswa : mahasiswas)
      if (mahasiswa.nim == nim) return mahasiswa;
    return null;
  }
}
