package perbankan;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Tabungan {
  private int saldo;

  public Tabungan(int saldo) {
    this.saldo = saldo;
  }

  public int getSaldo() {
    return saldo;
  }

  public void simpanUang(int jumlah) {
    saldo += jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if(saldo < jumlah) return false;
    saldo -= jumlah;
    return true;
  }
}
