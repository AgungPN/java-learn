package tts;

public class FilmIndonesia extends CinemaXXI{
  public float hargaTiket;
  public float pajak;
  public float totalBayar;



  public void hitungTotal(){
//    String[] seninToKamis = { "Senin","Selasa","Rabu","Kamis" };
//    for (int i = 0; i < seninToKamis.length; i++) {
//      if(hari.equals(seninToKamis[i]))
//    }
    if(hari.equals("Senin") || hari.equals("Selasa")|| hari.equals("Rabu") || hari.equals("Kamis")){
      hargaTiket = 35000;
    }
    else if(hari.equals("Jumat")){
      hargaTiket = 40000;
    } else if (hari.equals("Sabtu")) {
      hargaTiket = 50000;
    } else {
      hargaTiket = 60000;
    }

    this.pajak = (float) (hargaTiket*2.5/100);

    totalBayar = (hargaTiket * jumlahTiket) + pajak;
  }
  
  public void cekBonus() {
    if(totalBayar >= 150000 && totalBayar <= 200000){
      System.out.println("Bonus 2 Popcorn Caramel Ukuran L.");
    }
  }
  
}
