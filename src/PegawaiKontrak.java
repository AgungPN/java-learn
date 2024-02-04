import java.util.Scanner;

public class PegawaiKontrak {
  public String nip;
  public String nama;
  public int gajiPokok;
  public int banyakLembur;
  public int t;
  public int lembur;
  public int totalGaji;

  public PegawaiKontrak() {
    gajiPokok = 5000000;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan NIP: ");
    nip = scanner.next();
    System.out.print("Masukkan nama: ");
    scanner.nextLine();
    nama = scanner.nextLine();
    System.out.print("Masukkan banyak lembur: ");
    banyakLembur = scanner.nextInt();

    lembur = banyakLembur * 50000;
    t = gajiPokok * 12 / 100;

    totalGaji = gajiPokok + t + lembur;
  }
}
