package tugas_kak_nina;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class File1 {
  private static String name = "Tono";
  static int umur = 20;

  public static void setName(String name) {
    File1.name = name;
  }

  public static String getName() {
    return name;
  }

}

class File2 extends File1 {
  static String name = File1.getName();

  static int umur = 23;

  static void cetakUmur() {
    System.out.println("umur : " + File1.umur);
  }

}

class Main extends File2 {
  public static void main(String[] args) {
    setName("Tina");
    System.out.println("Anak ke-1");
    System.out.println("---------");
    System.out.println("Nama : " + getName());
    cetakUmur();

    System.out.println("");
    System.out.println("Anak ke-2");
    System.out.println("Nama : " + File2.name);
    File2.cetakUmur();
  }

  static void cetakUmur() {
    System.out.println("Umur : " + File2.umur);
  }

  static void cetakUmur(int umur) {
    System.out.println("Umur : " + umur);
  }
}
