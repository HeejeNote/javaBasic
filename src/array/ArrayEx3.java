package array;

import java.util.Scanner;

public class ArrayEx3 {
    /**
     * 5개의 정수를 입력하세요:
     * 1
     * 2
     * 3
     * 4
     * 5
     * 입력한 정수를 역순으로 출력:
     * 5, 4, 3, 2, 1
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요 : ");
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력 : ");

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }

    }
}
