package learning.classes.exception;

import learning.records.LoginRequest;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Validation {
  public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
    if (loginRequest.email() == null) {
      throw new NullPointerException("Email tidak boleh null");
    } else if (loginRequest.email().isBlank()) {
      throw new ValidationException("email tidak boleh kosong");
    }
  }
}
