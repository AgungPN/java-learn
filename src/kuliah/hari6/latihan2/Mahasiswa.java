package kuliah.hari6.latihan2;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Mahasiswa {
  private int nim;
  private String name;

  public Mahasiswa(int i, String n) {
    nim = i;
    name = n;
  }

  public int getNim() {
    return nim;
  }

  public String getName() {
    return name;
  }
}
