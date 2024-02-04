package learning.collection;

import java.util.Arrays;
import java.util.List;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class ConvertToArray {
  public static void main(String[] args) {
    List<String > list = List.of("Agung","Prasetyo","Nugroho");
    Object[] object = list.toArray();  // convert to array type object
    String[] strings = list.toArray(new String[]{});  // convert to array type string

    System.out.println(Arrays.toString(object));
    System.out.println(Arrays.toString(strings));
  }
}
