package kuliah.hari6.tugas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Agung Prasetyo Nugroho <672021077>
 */
public class Tabungan {
  private int saldo;

  public Tabungan(int initSaldo) {
    saldo = initSaldo;
  }

  public int getSaldo() {
    return saldo;
  }

  public void simpanUang(int jumlah) {
    saldo += jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if (saldo >= jumlah) {
      saldo -= jumlah;
      return true;
    }
    return false;
  }
}
