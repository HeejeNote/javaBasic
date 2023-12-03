package solveArray;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {

        /**
         * 입력 예시 :::
         * 5개의 정수를 입력하세요:
         * 1
         * 2
         * 3
         * 4
         * 5
         * 출력 예시 :::
         * 1, 2, 3, 4, 5
         */

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");

        for(int i=0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length -1){
                System.out.print(", ");
            }
        }




    }
}
