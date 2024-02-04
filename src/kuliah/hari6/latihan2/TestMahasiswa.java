package kuliah.hari6.latihan2;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class TestMahasiswa {
  public static void main(String[] args) {
    Mahasiswa mahasiswa = new Mahasiswa(672021077, "Agung Prasetyo Nugroho");
    System.out.println("NIM: "+ mahasiswa.getNim());
    System.out.println("Name: "+ mahasiswa.getName());
  }
}
