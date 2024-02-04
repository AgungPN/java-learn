package learning.lambda.util;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class StringUtil {

  public static boolean isLowerCase(String string) {
    for (char character : string.toCharArray()) {
      if (!Character.isLowerCase(character)) return false;
    }
    return true;
  }

  public boolean isLowerCaseNonStatic(String string) {
    for (var character : string.toCharArray())
      if (!Character.isLowerCase(character)) return false;
    return true;
  }

}
