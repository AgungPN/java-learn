
/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class TestLatihan {

  public static String getTime(Kalender kal) {
    String tmp;
    tmp = kal.getTanggal() + "-" + kal.getBulan() + "-" + kal.getTahun();
    return tmp;
  }

  public static void main(String[] args) {
    Kalender kal = new Kalender(8);
    System.out.println("waktu awal: " + getTime(kal));
    kal.setTanggal(9);
    System.out.println("satu hari setelah waktu awal: " + getTime(kal));
    kal = new Kalender(6, 2003);
    System.out.println("waktu berubah: " + getTime(kal));
    kal.setBulan(7);
    System.out.println("satu bulan setelah itu: " + getTime(kal));
    kal = new Kalender(10, 20, 2014);
    System.out.println("waktu berubah: " + getTime(kal));
    kal.setTahun(2005);
    System.out.println("satu tahun setelah itu: " + getTime(kal));
  }
}
