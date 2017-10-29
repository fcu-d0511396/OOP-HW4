package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /**
   * This is the main function.
   * @param args This is main needed.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number:");
    int number;
    number = scanner.nextInt();
    NissanTiida object1 = new NissanTiida();
    for ( int i = 0 ; i < number ; i++ ) {
      object1.tiida();
    }
    scanner.close();
  }
}
