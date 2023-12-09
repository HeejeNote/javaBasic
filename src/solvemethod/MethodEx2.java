package solvemethod;

public class MethodEx2 {

    /**
     * ::: method Refactoring :::
     *  public static void main(String[] args) {
     *      String message = "Hello, world!";
     *      for (int i = 0; i < 3; i++) {
     *          System.out.println(message);
     *      }
     *      for (int i = 0; i < 5; i++) {
     *          System.out.println(message);
     *      }
     *      for (int i = 0; i < 7; i++) {
     *          System.out.println(message);
     *      }
     *  }
     *
     */
    public static void main(String[] args) {

        String message = "Hello, world!";

        repeatMessage(message, 3);
        repeatMessage(message, 5);
        repeatMessage(message, 7);

    }

    public static void repeatMessage(String message, int count){

        for(int i = 0; i < count; i++){
            System.out.println(message);
        }
    }

}
