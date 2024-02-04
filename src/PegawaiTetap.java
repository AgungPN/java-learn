import java.util.Scanner;

public class PegawaiTetap {
  public String nip;
  public String nama;
  public int gajiPokok;
  public int banyakLembur;
  public int t;
  public int lembur;
  public int totalGaji;

  public PegawaiTetap() {
    gajiPokok = 10000000;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan NIP: ");
    nip = scanner.next();
    System.out.print("Masukkan nama: ");
    scanner.nextLine();
    nama = scanner.nextLine();
    System.out.print("Masukkan banyak lembur: ");
    banyakLembur = scanner.nextInt();

    lembur = banyakLembur * 75000;
    t = gajiPokok * 24 / 100;

    totalGaji = gajiPokok + t + lembur;
  }
}
