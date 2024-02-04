package learning.lambda;

import learning.lambda.util.StringUtil;

import java.util.function.Predicate;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class MethodReferenceApp {
  public static void main(String[] args) {
//    lamda biasa
    Predicate<String> predicateIsLowerCase = (string) -> StringUtil.isLowerCase(string);
    System.out.println(predicateIsLowerCase.test("Hallo"));

//    lamda method reference (Static method)
    // kondisi harus sama dengan test() artinya harus return boolean dan 1 parameter string
    Predicate<String> predicateIsLowerCase1 = StringUtil::isLowerCase;
    System.out.println(predicateIsLowerCase1.test("hallo"));


//    Lamda method reference (Non static method)
    StringUtil stringUtil = new StringUtil();
    Predicate<String> stringPredicate = stringUtil::isLowerCaseNonStatic;
    System.out.println(stringPredicate.test("Wow"));
  }
}
