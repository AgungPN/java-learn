package kuliah;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class App {
  public static void main(String[] args) {
    Siswa siswa1 = new Siswa();
//    siswa.nim = 672021077;
    siswa1.setNim(672021077);
    siswa1.setName("Agung Prasetyo Nugroho");
    siswa1.info();

    System.out.println("nama siswa pertama adalah: "+siswa1.getName()+ " dan NIMku adalah: "+ siswa1.getNim());

    Siswa siswa2 = new Siswa();
    siswa2.setName("Agung PN");
    siswa2.setNim(672021000);
    System.out.println("nama siswa kedua adalah: "+ siswa2.getName() + " dan NIMnya adalah: "+ siswa2.getNim());

  }
}
