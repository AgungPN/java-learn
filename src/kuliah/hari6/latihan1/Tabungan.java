package kuliah.hari6.latihan1;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Tabungan {
  public int saldo;

  public Tabungan(int initSaldo) {
    saldo = initSaldo;
  }

  public void ambilUang(int jumlah) {
    saldo -= jumlah;
  }

}
