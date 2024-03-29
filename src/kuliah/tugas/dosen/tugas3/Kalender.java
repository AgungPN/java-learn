
/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Kalender {
  private int tanggal;
  private int bulan;
  private int tahun;

  public Kalender(int tanggal) {
    this(tanggal, 1, 2000);
  }

  public Kalender(int bulan, int tahun) {
    this(1, bulan, tahun);
  }

  public Kalender(int tanggal, int bulan, int tahun) {
    this.tanggal = tanggal;
    this.bulan = bulan;
    this.tahun = tahun;
  }

  public int getTanggal() {
    return tanggal;
  }

  public int getBulan() {
    return bulan;
  }

  public int getTahun() {
    return tahun;
  }

  public void setTanggal(int tanggal) {
    this.tanggal = tanggal;
  }

  public void setBulan(int bulan) {
    this.bulan = bulan;
  }

  public void setTahun(int tahun) {
    this.tahun = tahun;
  }
}
