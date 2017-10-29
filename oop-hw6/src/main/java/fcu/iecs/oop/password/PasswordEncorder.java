package fcu.iecs.oop.password;

public class PasswordEncorder {
  private String word;
  
  public String getString() {
    return word;
  }
  
  public void setString(String input) {
    word = input;
  }
  /**
   * replace the keyword into what we wanted.
   * @param input word which been input.
   * @return input
   */
  
  public String encoder(String input) {
    input = input.replaceAll("a", "4");
    input = input.replaceAll("A", "4");
    input = input.replaceAll("E", "3");
    input = input.replaceAll("e", "3");
    input = input.replaceAll("I", "1");
    input = input.replaceAll("i", "1");
    input = input.replaceAll("O", "0");
    input = input.replaceAll("o", "0");
    input = input.replaceAll("T", "7");
    input = input.replaceAll("t", "7");
    return input;
  }
}
