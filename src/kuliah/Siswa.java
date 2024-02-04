package kuliah;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Siswa {
  private int nim;
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNim(int nim) {
    this.nim = nim;
  }

  public int getNim() {
    return nim;
  }

  public  void  info(){
    System.out.println("Ini siswa FTI");
  }
}
