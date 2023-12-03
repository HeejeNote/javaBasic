package solveMethod;

public class MethodEx1 {
    /**
     * ::: method Refactoring :::
     * public static void main(String[] args) {
     *  int a = 1;
     *  int b = 2;
     *  int c = 3;
     *  int sum = a + b + c;
     *  double average = sum / 3.0;
     *  System.out.println("평균값: " + average);
     *  int x = 15;
     *  int y = 25;
     *  int z = 35;
     *  sum = x + y + z;
     *  average = sum / 3.0;
     *  System.out.println("평균값: " + average);
     * }
     */

    public static void main(String[] args) {

        System.out.println("평균값: " + avg(1,2,3) );

        System.out.println("평균값: " + avg(15,25,35) );

    }

    public static double avg(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        return avg;
    }

}
