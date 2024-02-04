package learning.dasar;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Array {
  public static void main(String[] args) {
//        di java array hanya bisa menyimpan dengan tipe data sama, dan panjangnya telah ditentukkan
//        Cara 1
    String[] arrayString = new String[3];
    arrayString[0] = "Agung";
    arrayString[1] = "Prasetyo";
    arrayString[2] = "Nugroho";

//        Cara 2
    String[] names = {"Agung", "Prasetyo", "Nugroho"};

    System.out.println(arrayString[0] + ' ' + names[1] + ' ' + names[2]);
//        Count array
    System.out.println("Count array names is " + names.length);

//       array multi dimensi
    int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(nums[0][1]);
    int[][] numbers = new int[2][3];
    numbers[0][0] = 1;
    numbers[0][2] = 3;
    
  }
}
