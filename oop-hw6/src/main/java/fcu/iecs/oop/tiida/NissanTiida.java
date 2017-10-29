package fcu.iecs.oop.tiida;

public class NissanTiida {
  private int count = 0;
  /**
   * Print the stars.
   */
  
  public void tiida() {
    count++;
    for (int i = 0 ; i < count ; i++) {
      for (int j = 0 ; j < count ; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
