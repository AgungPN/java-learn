package kuliah.tugasnesta;

import java.util.ArrayList;

public class listToko {

    public ArrayList<Toko> data;

    public listToko() {
        data = new ArrayList<Toko>();
    }

    public void input(int a, String b, long c) {
        //data.add("Ikan Bandeng"); //ini kalau inputnya manual hardscript
        data.add(new Toko(a, b, c)); //ini inputnya dari user secara dinamis
    }

    public void tampil() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println("KODE : " + data.get(i).kode);
            System.out.println("BARANG : " + data.get(i).namaBarang);
            System.out.println("HARGA : " + data.get(i).harga);
            System.out.println("--------------------------------");
        }
    }

    public void ubah(int index, int a, String b, long c) {
        data.set(index, new Toko(a, b, c));
    }

    public void hapus(int index, int a, String b, long c) {
        data.remove(index);
    }

    void hapus(int index) {
      data.remove(index);
//      throw new UnsupportedOperationException("Not supported yet.");
    }
}