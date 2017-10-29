package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /**
   * This is the main function.
   * @param args The main needed.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PasswordEncorder object1 = new PasswordEncorder();
    String input;
    boolean control = true;
    while (control) {
      System.out.print("Please enter a password:");
      input = scanner.nextLine();
      if (input.equals("exit")) {
        control = false;
      }
      else {
        object1.setString(input);
        object1.setString(object1.encoder(object1.getString()));
        System.out.println(object1.getString());
      }
    }
    scanner.close();
  }
}
