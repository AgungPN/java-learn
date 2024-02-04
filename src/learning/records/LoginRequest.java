package learning.records;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public record LoginRequest(String email, String password) {  // constructor langsung di ()
/*
  ketika ingin membuat class hanya untuk getter, equals, toString, hashCode, constructor method kita bisa menggunakan record.
  Itu secara otomatis akan dibuatkan.
  Tetapi dengan record kita tidak bisa melakukan extends karena secara otomatis meng extendts class java.lang.Record, tetapi tetap bisa implements
*/


}
