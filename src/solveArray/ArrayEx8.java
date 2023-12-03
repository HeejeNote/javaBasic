package solveArray;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {

        /**
         * 학생수를 입력하세요:3
         * 1번 학생의 성적을 입력하세요:
         * 국어 점수:10
         * 영어 점수:20
         * 수학 점수:30
         * 2번 학생의 성적을 입력하세요:
         * 국어 점수:10
         * 영어 점수:10
         * 수학 점수:10
         * 3번 학생의 성적을 입력하세요:
         * 국어 점수:20
         * 영어 점수:20
         * 수학 점수:20
         * 1번 학생의 총점: 60, 평균: 20.0
         * 2번 학생의 총점: 30, 평균: 10.0
         * 3번 학생의 총점: 60, 평균: 20.0
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("학생수를 입력하세요: ");
        int count = sc.nextInt();
        String[] subjects = {"국어", "영어", "수학"};

        int[][] students = new int[count][subjects.length];
        int sum = 0;

        for(int i = 0; i < count; i++){
            System.out.println((i+1)+ "번 학생의 성적을 입력하세요 : ");
            for(int j = 0; j < students[i].length; j++){
                students[i][j] = sc.nextInt();
                System.out.println(subjects[j] + " 점수:" + students[i][j]);
                sum += students[i][j];
            }
            double avg = (double) sum / subjects.length;
            System.out.println((i+1) + "번 학생의 총점 : " + sum + ", 평균 : " + avg);
        }




    }
}
