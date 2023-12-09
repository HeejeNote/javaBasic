package solvearray;

import java.util.Scanner;

public class ArrayEx5 {
    /**
     * 실행 결과 예시1
     * 입력받을 숫자의 개수를 입력하세요:3
     * 3개의 정수를 입력하세요:
     * 1
     * 2
     * 3
     * 입력한 정수의 합계: 6
     * 입력한 정수의 평균: 2.0
     */

    /**
     * 실행 결과 예시2
     * 입력받을 숫자의 개수를 입력하세요:5
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

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        System.out.println(count + "개의 정수를 입력하세요 :");
        int[] numbers = new int[count];

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double avg = sum / numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);


    }
}
