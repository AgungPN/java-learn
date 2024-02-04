package learning.dasar;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Condition {
    public static void main(String[] args) {
      if ('1' == 1) {
        System.out.println("tes");
      }

        ifElse(200);
        switchCase('A');
        switchLamda('C');
        System.out.println(yieldSwitch('A'));
        System.out.println(ternary(20));
    }

    public static void ifElse(int value) {
//        if else expression
        if (value >= 75 && value <= 100) {
            System.out.println("Anda Lulus dengan nilai super bagus");
        } else if (value >= 50 && value <= 100) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
    }

    public static void switchCase(char grade) {
//        switch case expression
        switch (grade) {
            case 'A':
                System.out.println("Anda Lulus dengan nilai super bagus");
                break;
            case 'B', 'C':
                System.out.println("Anda Lulus");
                break;
            default:
                System.out.println("Anda Tidak Lulus");
        }
    }

    public static void switchLamda(char grade) {
//        switch case lambda is switch case without break (since java 14)
        switch (grade) {
            case 'A' -> System.out.println("Anda Lulus dengan nilai super bagus");
            case 'B', 'C' -> System.out.println("Anda Lulus");
//            use {} for multi statement
            default -> {
                System.out.println("Anda Tidak Lulus");
            }
        }

    }

    public static String yieldSwitch(char grade){
//        since java 14 we can initialize variable with yield in switch case
        String word = switch (grade){
            case 'A':
                yield "Anda Lulus dengan nilai super bagus";
            case 'B','C':
                yield "Anda Lulus";
            default:
                yield "Anda tidak Lulus";
        };

        return word;
    }

    public static String ternary(int value){
        return value >= 75 ? "Anda Lulus":"Anda Tidak Lulus";
    }

}
