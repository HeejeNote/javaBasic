package solveArray;

import java.util.Scanner;

public class ArrayEx6 {
    /**
     * 입력받을 숫자의 개수를 입력하세요:3
     * 3개의 정수를 입력하세요:
     * 1
     * 2
     * 5
     * 가장 작은 정수: 1
     * 가장 큰 정수: 5
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        System.out.println(count + "개의 정수를 입력하세요 : ");
        int[] numbers = new int[count];
        int min, max;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        min = max = numbers[0];

        for(int i = 1; i < numbers.length; i++){

                if(numbers[i] < min){
                    min = numbers[i];
                }

                if(numbers[i] > max){
                    max = numbers[i];
                }
            }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

    }
}
