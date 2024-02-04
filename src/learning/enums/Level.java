package learning.enums;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public enum Level {
  EASY("easy level"),
  NORMAL("normal level"),
  HARD( "hard level"),
  HELL("hell level");

  private String description;
  Level(String description){
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
