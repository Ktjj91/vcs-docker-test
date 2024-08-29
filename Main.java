/**
 * Main
 */
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world !");

    //chec if number than is upper 10
    boolean isUpperThan10 = isUpperThen(11);
    System.out.println(isUpperThan10);
  }

  public static boolean isUpperThen(int number) {
    return number > 10;
  }

}