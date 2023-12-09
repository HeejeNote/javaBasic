package solvearray;

import java.util.Scanner;

public class ArrayEx4 {
    /**
     * 5개의 정수를 입력하세요:
     * 1
     * 2
     * 3
     * 4
     * 5
     * 입력한 정수의 합계: 15
     * 입력한 정수의 평균: 3.0
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for(int i = 0; i < numbers.length ; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];

        }

        double avg = sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);

    }
}
