package kuliah.kuisasdos;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Mahasiswa {
  public int nim;
  public int umur;
  public int pointKKM;
  public String name;
  public String fakultas;

  public Mahasiswa() {
  }
  public Mahasiswa(int initNim, int initUmur,  String initName, String initFakultas) {
    nim = initNim;
    umur = initUmur;
    name = initName;
    fakultas = initFakultas;
  }

}
