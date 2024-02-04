package learning.dasar;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class TypeData {
  public static void main(String[] args) {
    number();
    character();
    bool();
    typeDataNonPrimitive();
//    untuk convert string ke primitive type menggunakan "parseInt" untuk type data object "menggunakan "valueOf"
    variable();
//    comparing two values, we can use == for primitive type and use method equals() to compare non-primitive type data
  }


  public static void number() {
//             number default 0
    byte thisByte = 100; // 1 byte (-128 to 127)
    short thisShort = 10000; // 2 byte (-32,768 to 32,767)
    int thisInt = 1000000000; // 4 byte (-2,147,483,648 to 2,147,483,647)
    long thisLong1 = 100000000; // 8 byte
    long thisLong2 = 1000000000000000000L;

    //        floating default 0.0
    float thisFloat = 10.101F; // 4 byte
    double thisDouble = 10.10; //8 byte

//        kode literal
    int decimalInt = 17;
    int hexInt = 0xFFFFF;  // heksa (harus diawali '0x' diawal)
    int binInt = 0b01010110; // binner  (harus diawali '0b' diawal)

//        underscore (since java 7 or 8)
    long amount = 1_000_000_000;
    System.out.printf("amount = %d\n", amount);

//        convert type data number
/*
        widening casting (automatic): byte->short->int->long->float->double
        narrowing casting (manual): double->float->long->int->char->short->byte
*/
//       automatic
    byte thisByte2 = 10;
    short thisShort2 = thisByte2;
    int thisInt2 = thisShort2;
    long thisLong3 = thisInt2;
    float thisFloat2 = thisLong3;
    double thisDouble2 = thisFloat2;

//        manual
    int intIntManual = 10000;
    byte iniByteManual = (byte) intIntManual; // setelah melewati batas (128) akan diulang lagi dari 0
    System.out.println(iniByteManual); // 16
  }

  public static char character() {
    char a = 'A'; // use single quote('')
    System.out.println(a);
    return a;
  }

  public static boolean bool() {
    boolean bool = true;  // default false
    return bool;
  }

  public static void typeDataNonPrimitive() {
/*
        type data non primitive default null
        primitive -> non primitive
        byte -> Byte
        short -> Short
        int -> Integer
        boolean -> Boolean
        char -> Character
*/

//        convert primitive to non primitive
    byte thisByte = 10;
    Byte thisByteObj = thisByte;
//        convert non primitive to primitive
    int thisInt = thisByteObj.intValue();
    float thisFloat = thisByteObj.floatValue();
    Long thisLongObj = Long.valueOf(thisInt);
    System.out.println(thisLongObj);

  }

  public static void variable() {
//        rumus: type name = value;
    int num;
    num = 29;

//        keyword var (since java 10 we can use var to make variable
    var newVar = "tes";

//        constanta
    final String name = "Agung Prasetyo Nugroho";
//        name = "new Name";  // error

//        concate
    System.out.println(name + ' ' + num);
  }

}
